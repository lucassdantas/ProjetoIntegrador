-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Maio-2023 às 22:47
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projetointegrador`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingredient`
--

CREATE TABLE `ingredient` (
  `ingredientId` int(11) NOT NULL,
  `nameI` varchar(25) NOT NULL,
  `priceI` float NOT NULL,
  `weightI` float NOT NULL,
  `quantityI` int(11) NOT NULL,
  `typeI` enum('u','k','g','h') NOT NULL,
  `creationI` varchar(30) DEFAULT NULL,
  `updateI` varchar(30) DEFAULT NULL,
  `statusI` enum('a','n','d','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `input`
--

CREATE TABLE `input` (
  `inputId` int(11) NOT NULL,
  `weightI` float NOT NULL,
  `costI` float NOT NULL,
  `quantityI` int(11) NOT NULL,
  `creationI` varchar(30) DEFAULT NULL,
  `updateI` varchar(30) DEFAULT NULL,
  `statusI` enum('a','n','d','') NOT NULL,
  `ingredientId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `output`
--

CREATE TABLE `output` (
  `ingredientId` int(11) NOT NULL,
  `requestId` int(11) NOT NULL,
  `snackId` int(11) NOT NULL,
  `creationOut` varchar(20) DEFAULT NULL,
  `updateOut` varchar(20) DEFAULT NULL,
  `statusOut` enum('a','n','d','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `relationsi`
--

CREATE TABLE `relationsi` (
  `snackId` int(11) NOT NULL,
  `ingredientId` int(11) NOT NULL,
  `quantitySI` float DEFAULT NULL,
  `WeightSI` float DEFAULT NULL,
  `creationSI` varchar(20) DEFAULT NULL,
  `updateSI` varchar(20) DEFAULT NULL,
  `statusSI` enum('a','n','d','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `relationsr`
--

CREATE TABLE `relationsr` (
  `requestId` int(11) NOT NULL,
  `snackId` int(11) NOT NULL,
  `creationSR` varchar(20) DEFAULT NULL,
  `updateSR` varchar(20) DEFAULT NULL,
  `statusSR` enum('a','n','d','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `request`
--

CREATE TABLE `request` (
  `requestId` int(11) NOT NULL,
  `nameR` varchar(255) NOT NULL,
  `valueR` float NOT NULL,
  `creationR` varchar(20) DEFAULT NULL,
  `updateR` varchar(20) DEFAULT NULL,
  `statusR` enum('a','n','d','') NOT NULL,
  `snackId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `snack`
--

CREATE TABLE `snack` (
  `snackId` int(11) NOT NULL,
  `nameS` varchar(255) NOT NULL,
  `costS` float NOT NULL,
  `priceS` float NOT NULL,
  `weightS` float NOT NULL,
  `creationS` varchar(30) DEFAULT NULL,
  `updateS` varchar(30) DEFAULT NULL,
  `statusS` enum('a','s','e','d') NOT NULL,
  `minQuantityS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `typeU` enum('a','g','e','c') NOT NULL,
  `nameU` varchar(255) NOT NULL,
  `photoU` varchar(255) NOT NULL,
  `creationU` varchar(20) DEFAULT NULL,
  `updateU` varchar(20) DEFAULT NULL,
  `statusU` enum('a','n','d','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`ingredientId`);

--
-- Índices para tabela `input`
--
ALTER TABLE `input`
  ADD PRIMARY KEY (`inputId`),
  ADD KEY `ingredientId` (`ingredientId`);

--
-- Índices para tabela `output`
--
ALTER TABLE `output`
  ADD PRIMARY KEY (`ingredientId`,`requestId`,`snackId`),
  ADD KEY `requestId` (`requestId`),
  ADD KEY `snackId` (`snackId`);

--
-- Índices para tabela `relationsi`
--
ALTER TABLE `relationsi`
  ADD PRIMARY KEY (`snackId`,`ingredientId`),
  ADD KEY `ingredientId` (`ingredientId`);

--
-- Índices para tabela `relationsr`
--
ALTER TABLE `relationsr`
  ADD PRIMARY KEY (`requestId`,`snackId`),
  ADD KEY `snackId` (`snackId`);

--
-- Índices para tabela `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`requestId`),
  ADD KEY `snackId` (`snackId`);

--
-- Índices para tabela `snack`
--
ALTER TABLE `snack`
  ADD PRIMARY KEY (`snackId`);

--
-- Índices para tabela `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `ingredientId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `input`
--
ALTER TABLE `input`
  MODIFY `inputId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `output`
--
ALTER TABLE `output`
  MODIFY `ingredientId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `relationsi`
--
ALTER TABLE `relationsi`
  MODIFY `snackId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `relationsr`
--
ALTER TABLE `relationsr`
  MODIFY `requestId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `request`
--
ALTER TABLE `request`
  MODIFY `requestId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `snack`
--
ALTER TABLE `snack`
  MODIFY `snackId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `user`
--
ALTER TABLE `user`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `input`
--
ALTER TABLE `input`
  ADD CONSTRAINT `input_ibfk_1` FOREIGN KEY (`ingredientId`) REFERENCES `ingredient` (`ingredientId`);

--
-- Limitadores para a tabela `output`
--
ALTER TABLE `output`
  ADD CONSTRAINT `output_ibfk_1` FOREIGN KEY (`ingredientId`) REFERENCES `ingredient` (`ingredientId`),
  ADD CONSTRAINT `output_ibfk_2` FOREIGN KEY (`requestId`) REFERENCES `request` (`requestId`),
  ADD CONSTRAINT `output_ibfk_3` FOREIGN KEY (`snackId`) REFERENCES `snack` (`snackId`);

--
-- Limitadores para a tabela `relationsi`
--
ALTER TABLE `relationsi`
  ADD CONSTRAINT `relationsi_ibfk_1` FOREIGN KEY (`ingredientId`) REFERENCES `ingredient` (`ingredientId`),
  ADD CONSTRAINT `relationsi_ibfk_2` FOREIGN KEY (`snackId`) REFERENCES `snack` (`snackId`);

--
-- Limitadores para a tabela `relationsr`
--
ALTER TABLE `relationsr`
  ADD CONSTRAINT `relationsr_ibfk_1` FOREIGN KEY (`requestId`) REFERENCES `request` (`requestId`),
  ADD CONSTRAINT `relationsr_ibfk_2` FOREIGN KEY (`snackId`) REFERENCES `snack` (`snackId`);

--
-- Limitadores para a tabela `request`
--
ALTER TABLE `request`
  ADD CONSTRAINT `request_ibfk_1` FOREIGN KEY (`snackId`) REFERENCES `snack` (`snackId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
