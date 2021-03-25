CREATE TRIGGER cliente_insert ON cliente AFTER INSERT

AS

BEGIN

  INSERT INTO bitacora (table_name, registro, usuario, ipv4, query, fecha) VALUES ('cliente', CAST((SELECT cliente.idCliente FROM cliente JOIN inserted ON cliente.idCliente = inserted.idCliente) AS VARCHAR(80)) + '-' + CAST((SELECT nombreCliente FROM inserted) AS VARCHAR(80)), CAST(USER_NAME() AS VARCHAR(80)), CAST(CONNECTIONPROPERTY('client_net_address') AS VARCHAR(20)), 'INSERT', CAST(CURRENT_TIMESTAMP AS VARCHAR(80)));

END