CREATE PROCEDURE productos_agotados

AS

  WITH almacenes_de_prod AS

  (SELECT codigoAlmacen, idProducto FROM inventario WHERE cantidadInventario=0)

  SELECT * 

  FROM producto 

  JOIN (

   SELECT almacen.codigoAlmacen, almacen.ciudad, almacenes_de_prod.idproducto

   FROM almacen 

   JOIN almacenes_de_prod ON almacen.codigoAlmacen = almacenes_de_prod.codigoAlmacen

   WHERE ciudad = 'Tegucigalpa' 

  ) AS t 

  ON producto.idProducto = t.idProducto;  