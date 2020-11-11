CREATE TABLE `booking` (
    `idBooking` int(11) NOT NULL,
    `checkIn` date NOT NULL,
    `checkOut` date NOT NULL,
    `createdAt` date NOT NULL,
    `breakfastIncluded` tinyint(4) NOT NULL,
    `parking` tinyint(4) NOT NULL,
    `cost` float NOT NULL,
    `guest` int(11) NOT NULL,
    `room` int(11) NOT NULL,
    PRIMARY KEY (`idBooking`),
    KEY `guest_idx` (`guest`),
    KEY `room_idx` (`room`),
    CONSTRAINT `guest` FOREIGN KEY (`guest`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT `room` FOREIGN KEY (`room`) REFERENCES `room` (`idRoom`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `cancellation` (
    `idCancellation` int(11) NOT NULL,
    `createdAt` date NOT NULL,
    `booking` int(11) NOT NULL,
    PRIMARY KEY (`idCancellation`),
    KEY `booking_idx` (`booking`),
    CONSTRAINT `booking2` FOREIGN KEY (`booking`) REFERENCES `booking` (`idBooking`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `payment` (
    `idpayment` int(11) NOT NULL,
    `createdAt` date NOT NULL,
    `booking` int(11) NOT NULL,
    `card` varchar(45) NOT NULL,
    `cardNumber` varchar(45) NOT NULL,
    PRIMARY KEY (`idpayment`),
    KEY `booking_idx` (`booking`),
    CONSTRAINT `booking` FOREIGN KEY (`booking`) REFERENCES `booking` (`idBooking`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `room` (
    `idRoom` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(45) NOT NULL,
    `price` float NOT NULL,
    `occupancy` int(11) NOT NULL,
    `availability` int(11) NOT NULL,
    `facilities` varchar(45) NOT NULL,
    PRIMARY KEY (`idRoom`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4

CREATE TABLE `user` (
    `idUser` int(11) NOT NULL AUTO_INCREMENT,
    `email` varchar(45) NOT NULL,
    `password` varchar(45) NOT NULL,
    `firstName` varchar(45) NOT NULL,
    `lastName` varchar(45) NOT NULL,
    `birthDate` date NOT NULL,
    `nationality` varchar(45) NOT NULL,
    PRIMARY KEY (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4