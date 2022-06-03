CREATE IF NOT EXISTS TABLE Paquete(
	paqueteID int NOT NULL AUTO_INCREMENT,
	SKU varchar(255) NOT NULL,
	Guia varchar(255),
	Activo bool,
	CreateAt timestamp NOT NULL DEFAULT now(),
	Update timestamp,
	PRIMARY KEY (paqueteID)
)

CREATE IF NOT EXISTS TABLE HistorialPaquete(
	HistoricoPaqueteID int NOT NULL AUTO_INCREMENT,
	paqueteID int NOT NULL,
	Latitud doble,
	Longitud double,
	Descripcion varchar(255) NOT NULL,
	Dominio int NOT NULL,
	PRIMARY KEY (HistoricoPaqueteID)
)

CREATE IF NOT EXISTS TABLE DominioPaquete(
    DominioPaqueteID int NOT NULL,
    Descripcion varchar(255) NOT NULL,
    Color int,
    Empresa bool,
    PRIMARY KEY (DominioPaqueteID)
)

CREATE IF NOT EXISTS TABLE Almacen(){
    AlmacenID
    Latitud doble,
	Longitud double,
    Descripcion varchar(255) NOT NULL,
    PRIMARY KEY (AlmacenID)
}

CREATE IF NOT EXISTS TABLE PaqueteAlmacen(
    PaqueteAlmacenID int NOT NULL AUTO_INCREMENT,
    PaqueteID int NOT NULL UNIQUE ,
    AlmacenID int NOT NULL ,
    InComeAT timestamp NOT NULL DEFAULT now(),
    OutComeAT timestamp,
    Exist bool NOT NULL DEFAULT 1,
    PRIMARY KEY (PaqueteAlmacenID)
)


