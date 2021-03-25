CREATE PROCEDURE monto_ventas

AS

BEGIN

  SELECT TOP 2 detalle_factura.idProducto, SUM(cantidadProducto * producto.precio) total

  FROM detalle_factura 

  JOIN producto 

  ON detalle_factura.idProducto = producto.idProducto

  GROUP BY detalle_factura.idProducto

  ORDER BY (total)

END