INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'GOLDENBOYS');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'CHANATINAIKOS');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'CHARLETICO');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'GAYATASARAY');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'MANCHISTER');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'CLEOTEBORG');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'KALIKEÑOS');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'XAVALEO');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'GOURMET');
INSERT INTO equiposfalm (beneficio, nombre) VALUES ('0', 'BABUSIANOS');

INSERT INTO usuario (nombre,password,equipo_id) VALUES ('JJ', 'JJ', (SELECT id FROM equiposfalm WHERE nombre='GOLDENBOYS'));
INSERT INTO usuario (nombre,password,equipo_id) VALUES ('Soler', 'Soler', (SELECT id FROM equiposfalm WHERE nombre='GOLDENBOYS'));
INSERT INTO equiposfalm_usuarios (equipo_falm_id,usuarios_id_usuario) values ((SELECT id from equiposfalm WHERE nombre='GOLDENBOYS'),(SELECT id_usuario from usuario WHERE nombre='JJ'));
INSERT INTO equiposfalm_usuarios (equipo_falm_id,usuarios_id_usuario) values ((SELECT id from equiposfalm WHERE nombre='GOLDENBOYS'),(SELECT id_usuario from usuario WHERE nombre='Soler'));

