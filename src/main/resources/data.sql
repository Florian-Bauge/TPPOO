CREATE TABLE address (
                      id          INTEGER PRIMARY KEY,
                      creation VARCHAR(64) NOT NULL,
                      content   varchar(64) NOT NULL);


INSERT INTO address (id, creation, content) VALUES (1, CURRENT_TIMESTAMP(), '57 boulevard demorieux');
INSERT INTO address (id, creation, content) VALUES (2, CURRENT_TIMESTAMP(), '51 allee du gamay, 34080,montpellier');