-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16-Jun-2023 às 06:10
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
-- Banco de dados: `novoprojetointegrador`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `datasheet`
--

CREATE TABLE `datasheet` (
  `dsSnackId` int(11) NOT NULL,
  `dsIngredientId` int(11) NOT NULL,
  `dsQuantity` decimal(10,2) DEFAULT NULL,
  `dsTotalCost` decimal(10,2) DEFAULT NULL,
  `dsStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `datasheet`
--

INSERT INTO `datasheet` (`dsSnackId`, `dsIngredientId`, `dsQuantity`, `dsTotalCost`, `dsStatus`) VALUES
(5, 6, '2.00', '5.71', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingredient`
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
-- Extraindo dados da tabela `ingredient`
--

INSERT INTO `ingredient` (`ingredientId`, `ingredientName`, `ingredientMinQuantity`, `ingredientUnitQuantity`, `ingredientUnitOfMeasure`, `ingredientUnitCost`, `ingredientStatus`, `ingredientStock`, `ingredientStockStatus`) VALUES
(5, 'Tomate', '0.20', '0.10', 'kg', '0.50', NULL, '55.00', NULL),
(6, 'Carne | X burguer ', '2.00', '0.35', 'kg', '1.00', NULL, '-23.00', NULL),
(7, 'Alface', '1.00', '1.00', 'un', '1.05', NULL, '0.00', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `input`
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
-- Extraindo dados da tabela `input`
--

INSERT INTO `input` (`inputId`, `inputIngredientId`, `inputQuantity`, `inputCost`, `inputDate`, `inputStatus`) VALUES
(21, 5, '15.00', '10.00', '2023-06-15', NULL),
(22, 6, '20.00', '7.00', '2023-06-15', NULL),
(23, 6, '25.00', '15.00', '2023-06-15', NULL),
(24, 5, '3.00', '1.00', '2023-06-16', NULL),
(25, 5, '1.00', '15.00', '2023-06-16', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `orders`
--

CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL,
  `orderSnackId` int(11) DEFAULT NULL,
  `orderQuantity` int(11) DEFAULT NULL,
  `orderCost` decimal(10,2) DEFAULT NULL,
  `orderUnitPrice` decimal(10,2) DEFAULT NULL,
  `orderTotalPrice` decimal(10,2) DEFAULT NULL,
  `orderDate` date DEFAULT NULL,
  `orderSnackName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `orders`
--

INSERT INTO `orders` (`orderId`, `orderSnackId`, `orderQuantity`, `orderCost`, `orderUnitPrice`, `orderTotalPrice`, `orderDate`, `orderSnackName`) VALUES
(14, NULL, 1, '81.00', '15.00', '15.00', '2023-06-15', 'hamburuguer'),
(15, NULL, 0, '50.00', '1.00', '0.00', '2023-06-15', 'test2'),
(16, NULL, 1, '3.00', '15.00', '15.00', '2023-06-15', 'Hamburguer'),
(17, NULL, 1, '3.00', '15.00', '15.00', '2023-06-15', 'Hamburguer'),
(18, NULL, 1, '3.00', '15.00', '15.00', '2023-06-15', 'Hamburguer'),
(19, 5, 2, '15.00', '15.00', '30.00', '2023-06-16', 'Hamburguer'),
(20, 5, 1, '15.00', '15.00', '15.00', '2023-06-16', 'Hamburguer'),
(21, 5, 2, '15.00', '15.00', '30.00', '2023-06-16', 'Hamburguer');

-- --------------------------------------------------------

--
-- Estrutura da tabela `snack`
--

CREATE TABLE `snack` (
  `snackId` int(11) NOT NULL,
  `snackTitle` varchar(255) DEFAULT NULL,
  `snackSellingPrice` float DEFAULT NULL,
  `snackDescription` varchar(255) DEFAULT NULL,
  `snackImageUrl` varchar(255) DEFAULT NULL,
  `snackStatus` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `snack`
--

INSERT INTO `snack` (`snackId`, `snackTitle`, `snackSellingPrice`, `snackDescription`, `snackImageUrl`, `snackStatus`) VALUES
(5, 'Hamburguer', 15, '15', '15', 'a');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`login`, `senha`) VALUES
('gabriel.modesto', 'newnew');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `datasheet`
--
ALTER TABLE `datasheet`
  ADD PRIMARY KEY (`dsSnackId`,`dsIngredientId`),
  ADD KEY `dsIngredientId` (`dsIngredientId`);

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
  ADD KEY `inputIngredientId` (`inputIngredientId`);

--
-- Índices para tabela `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`orderId`),
  ADD KEY `orderSnackId` (`orderSnackId`);

--
-- Índices para tabela `snack`
--
ALTER TABLE `snack`
  ADD PRIMARY KEY (`snackId`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `ingredientId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `input`
--
ALTER TABLE `input`
  MODIFY `inputId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `orders`
--
ALTER TABLE `orders`
  MODIFY `orderId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de tabela `snack`
--
ALTER TABLE `snack`
  MODIFY `snackId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `datasheet`
--
ALTER TABLE `datasheet`
  ADD CONSTRAINT `datasheet_ibfk_1` FOREIGN KEY (`dsIngredientId`) REFERENCES `ingredient` (`ingredientId`),
  ADD CONSTRAINT `datasheet_ibfk_2` FOREIGN KEY (`dsSnackId`) REFERENCES `snack` (`snackId`);

--
-- Limitadores para a tabela `input`
--
ALTER TABLE `input`
  ADD CONSTRAINT `input_ibfk_1` FOREIGN KEY (`inputIngredientId`) REFERENCES `ingredient` (`ingredientId`);

--
-- Limitadores para a tabela `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`orderSnackId`) REFERENCES `snack` (`snackId`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
