-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/06/2023 às 01:31
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `novoprojetointegrador`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `datasheet`
--

CREATE TABLE `datasheet` (
  `dsSnackId` int(11) NOT NULL,
  `dsIngredientId` int(11) NOT NULL,
  `dsQuantity` decimal(10,2) DEFAULT NULL,
  `dsTotalCost` decimal(10,2) DEFAULT NULL,
  `dsStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `datasheet`
--

INSERT INTO `datasheet` (`dsSnackId`, `dsIngredientId`, `dsQuantity`, `dsTotalCost`, `dsStatus`) VALUES
(1, 4, 3.00, 75.00, NULL),
(2, 4, 2.00, 50.00, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `ingredient`
--

CREATE TABLE `ingredient` (
  `ingredientId` int(11) NOT NULL,
  `ingredientName` varchar(255) DEFAULT NULL,
  `ingredientMinQuantity` decimal(10,2) DEFAULT NULL,
  `ingredientUnitQuantity` decimal(10,2) DEFAULT NULL,
  `ingredientUnitOfMeasure` varchar(50) DEFAULT NULL,
  `ingredientUnitCost` decimal(10,2) DEFAULT NULL,
  `ingredientStatus` varchar(255) DEFAULT NULL,
  `ingredientStock` decimal(10,2) DEFAULT NULL,
  `ingredientStockStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ingredient`
--

INSERT INTO `ingredient` (`ingredientId`, `ingredientName`, `ingredientMinQuantity`, `ingredientUnitQuantity`, `ingredientUnitOfMeasure`, `ingredientUnitCost`, `ingredientStatus`, `ingredientStock`, `ingredientStockStatus`) VALUES
(3, 'tomate2', 3.00, 0.10, 'kg', 1.00, NULL, 0.00, NULL),
(4, 'alface', 1.00, 1.00, 'pés', 25.00, NULL, 0.00, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `input`
--

CREATE TABLE `input` (
  `inputId` int(11) NOT NULL,
  `inputIngredientId` int(11) DEFAULT NULL,
  `inputQuantity` decimal(10,2) DEFAULT NULL,
  `inputCost` decimal(10,2) DEFAULT NULL,
  `inputDate` date DEFAULT NULL,
  `inputStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `input`
--

INSERT INTO `input` (`inputId`, `inputIngredientId`, `inputQuantity`, `inputCost`, `inputDate`, `inputStatus`) VALUES
(4, 3, 2.00, 5.00, '2023-06-12', NULL),
(8, 3, 15.00, 25.00, '2023-06-12', NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `orders`
--

CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL,
  `orderSnackId` int(11) DEFAULT NULL,
  `orderQuantity` int(11) DEFAULT NULL,
  `orderCost` decimal(10,2) DEFAULT NULL,
  `orderUnitPrice` decimal(10,2) DEFAULT NULL,
  `orderTotalPrice` decimal(10,2) DEFAULT NULL,
  `orderDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `snack`
--

CREATE TABLE `snack` (
  `snackId` int(11) NOT NULL,
  `snackTitle` text DEFAULT NULL,
  `snackSellingPrice` decimal(10,2) DEFAULT NULL,
  `snackDescription` varchar(255) DEFAULT NULL,
  `snackImageUrl` varchar(255) DEFAULT NULL,
  `snackStatus` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `snack`
--

INSERT INTO `snack` (`snackId`, `snackTitle`, `snackSellingPrice`, `snackDescription`, `snackImageUrl`, `snackStatus`) VALUES
(1, 'hamburuguer', 15.00, 'teste', NULL, NULL),
(2, 'test2', 1.00, '1', NULL, NULL),
(3, 'teste', 1.00, 'te', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`login`, `senha`) VALUES
('gabriel.modesto', 'newnew');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `datasheet`
--
ALTER TABLE `datasheet`
  ADD PRIMARY KEY (`dsSnackId`,`dsIngredientId`),
  ADD KEY `dsIngredientId` (`dsIngredientId`);

--
-- Índices de tabela `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`ingredientId`);

--
-- Índices de tabela `input`
--
ALTER TABLE `input`
  ADD PRIMARY KEY (`inputId`),
  ADD KEY `inputIngredientId` (`inputIngredientId`);

--
-- Índices de tabela `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`orderId`),
  ADD KEY `orderSnackId` (`orderSnackId`);

--
-- Índices de tabela `snack`
--
ALTER TABLE `snack`
  ADD PRIMARY KEY (`snackId`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `ingredientId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `input`
--
ALTER TABLE `input`
  MODIFY `inputId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `orders`
--
ALTER TABLE `orders`
  MODIFY `orderId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `snack`
--
ALTER TABLE `snack`
  MODIFY `snackId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `datasheet`
--
ALTER TABLE `datasheet`
  ADD CONSTRAINT `datasheet_ibfk_1` FOREIGN KEY (`dsSnackId`) REFERENCES `snack` (`snackId`),
  ADD CONSTRAINT `datasheet_ibfk_2` FOREIGN KEY (`dsIngredientId`) REFERENCES `ingredient` (`ingredientId`);

--
-- Restrições para tabelas `input`
--
ALTER TABLE `input`
  ADD CONSTRAINT `input_ibfk_1` FOREIGN KEY (`inputIngredientId`) REFERENCES `ingredient` (`ingredientId`);

--
-- Restrições para tabelas `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`orderSnackId`) REFERENCES `snack` (`snackId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
