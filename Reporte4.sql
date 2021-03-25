CREATE PROCEDURE unidad_ventas

AS

BEGIN

  SELECT TOP 2 idProducto, SUM(cantidadProducto) 

  FROM detalle_factura 

  JOIN factura

  ON detalle_factura.noFactura = factura.noFactura

  WHERE fechaEmision = '%2020%' 

  GROUP BY (idProducto)

  ORDER BY SUM(cantidadProducto);

END