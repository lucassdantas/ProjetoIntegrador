-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Jun-2023 às 05:00
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
  `dsQuantity` float DEFAULT NULL,
  `dsTotalCost` float DEFAULT NULL,
  `dsStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `datasheet`
--

INSERT INTO `datasheet` (`dsSnackId`, `dsIngredientId`, `dsQuantity`, `dsTotalCost`, `dsStatus`) VALUES
(1, 1, 1, 0.998, NULL),
(1, 2, 1, 1.52, NULL),
(1, 3, 0.01, 0.277, NULL),
(1, 4, 0.01, 0.384, NULL),
(1, 5, 0.1, 0.356, NULL),
(1, 6, 0.03, 0.1797, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingredient`
--

CREATE TABLE `ingredient` (
  `ingredientId` int(11) NOT NULL,
  `ingredientName` varchar(255) DEFAULT NULL,
  `ingredientMinQuantity` float DEFAULT NULL,
  `ingredientUnitQuantity` float DEFAULT NULL,
  `ingredientUnitOfMeasure` varchar(50) DEFAULT NULL,
  `ingredientUnitCost` float DEFAULT NULL,
  `ingredientStatus` varchar(255) DEFAULT NULL,
  `ingredientStock` float DEFAULT NULL,
  `ingredientStockStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `ingredient`
--

INSERT INTO `ingredient` (`ingredientId`, `ingredientName`, `ingredientMinQuantity`, `ingredientUnitQuantity`, `ingredientUnitOfMeasure`, `ingredientUnitCost`, `ingredientStatus`, `ingredientStock`, `ingredientStockStatus`) VALUES
(1, 'pao de hamburguer', 20, 1, 'un', 0.998, NULL, 100, NULL),
(2, 'hamburguer', 20, 1, 'un', 1.52, NULL, 100, NULL),
(3, 'batata palha', 5, 0.01, 'kg', 0.277, NULL, 1, NULL),
(4, 'queijo fatiado', 1, 0.01, 'kg', 0.384, NULL, 1, NULL),
(5, 'bacon fatiado', 1, 0.01, 'kg', 0.356, NULL, 1, NULL),
(6, 'alface', 3, 0.03, 'pes', 0.1797, NULL, 3, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `input`
--

CREATE TABLE `input` (
  `inputId` int(11) NOT NULL,
  `inputIngredientId` int(11) DEFAULT NULL,
  `inputQuantity` float DEFAULT NULL,
  `inputCost` float DEFAULT NULL,
  `inputDate` date DEFAULT NULL,
  `inputStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `input`
--

INSERT INTO `input` (`inputId`, `inputIngredientId`, `inputQuantity`, `inputCost`, `inputDate`, `inputStatus`) VALUES
(1, 1, 100, 99.8, '2023-06-20', NULL),
(2, 2, 100, 152, '2023-06-20', NULL),
(3, 3, 1, 27.7, '2023-06-20', NULL),
(4, 4, 1, 38.4, '2023-06-20', NULL),
(5, 5, 1, 35.6, '2023-06-20', NULL),
(6, 6, 3, 17.97, '2023-06-20', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `orders`
--

CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL,
  `orderSnackId` int(11) DEFAULT NULL,
  `orderQuantity` int(11) DEFAULT NULL,
  `orderCost` float DEFAULT NULL,
  `orderUnitPrice` float DEFAULT NULL,
  `orderTotalPrice` float DEFAULT NULL,
  `orderDate` date DEFAULT NULL,
  `orderSnackName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `snack`
--

CREATE TABLE `snack` (
  `snackId` int(11) NOT NULL,
  `snackTitle` varchar(255) DEFAULT NULL,
  `snackSellingPrice` float DEFAULT NULL,
  `snackDescription` varchar(255) DEFAULT NULL,
  `snackImageUrl` varchar(255) DEFAULT 'C:\\Users\\42labinfo\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\productImages\\default.jpg',
  `snackStatus` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `snack`
--

INSERT INTO `snack` (`snackId`, `snackTitle`, `snackSellingPrice`, `snackDescription`, `snackImageUrl`, `snackStatus`) VALUES
(1, 'Hamburguer', 12, 'Aqui é a descrição do lanche.', 'C:\\Users\\42labinfo\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\productImages\\hamburguer.jpg', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `userId` int(11) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`userId`, `login`, `senha`) VALUES
(1, 'admin', 'admin');

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
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `ingredientId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `input`
--
ALTER TABLE `input`
  MODIFY `inputId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `orders`
--
ALTER TABLE `orders`
  MODIFY `orderId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `snack`
--
ALTER TABLE `snack`
  MODIFY `snackId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
