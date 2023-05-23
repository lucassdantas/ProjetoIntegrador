-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23/05/2023 às 02:31
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
-- Banco de dados: `projetointegrador`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `entradas`
--

CREATE TABLE `entradas` (
  `input_i` int(11) NOT NULL,
  `weight_i` float DEFAULT NULL,
  `cost_i` float DEFAULT NULL,
  `quantity_i` int(11) DEFAULT NULL,
  `creation_i` varchar(20) DEFAULT NULL,
  `update_i` varchar(20) DEFAULT NULL,
  `status_i` enum('a','d') DEFAULT NULL,
  `id_ingrediente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ingredientes`
--

CREATE TABLE `ingredientes` (
  `id_ingrediente` int(11) NOT NULL,
  `name_i` varchar(30) DEFAULT NULL,
  `price_i` float DEFAULT NULL,
  `weight_i` float DEFAULT NULL,
  `quantity_i` int(11) DEFAULT NULL,
  `tipo_i` enum('k','g','u') NOT NULL,
  `criacao_i` varchar(20) DEFAULT NULL,
  `atualizacao_i` varchar(20) DEFAULT NULL,
  `status_i` enum('n','l','e','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `lanches`
--

CREATE TABLE `lanches` (
  `id_lanche` int(11) NOT NULL,
  `nome_l` varchar(255) NOT NULL,
  `custo_l` float NOT NULL,
  `preco_l` float NOT NULL,
  `peso_l` float NOT NULL,
  `criacao_l` varchar(20) DEFAULT NULL,
  `atualizacao_l` varchar(20) DEFAULT NULL,
  `q_minima_l` int(11) NOT NULL,
  `status` enum('a','s','e','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `id_pedido` int(11) NOT NULL,
  `nome_p` varchar(255) NOT NULL,
  `valor_p` float NOT NULL,
  `criacao_p` varchar(20) DEFAULT NULL,
  `atualizacao_p` varchar(20) DEFAULT NULL,
  `status_p` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `relacao_l_i`
--

CREATE TABLE `relacao_l_i` (
  `id_lanche` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  `quantidade_li` int(11) DEFAULT NULL,
  `peso_li` float DEFAULT NULL,
  `criacao_li` varchar(20) DEFAULT NULL,
  `atualizacao_li` varchar(20) DEFAULT NULL,
  `status` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `relacoes_p_l`
--

CREATE TABLE `relacoes_p_l` (
  `id_pedido` int(11) NOT NULL,
  `id_lanche` int(11) NOT NULL,
  `criacao_pl` varchar(20) DEFAULT NULL,
  `atualizacao_pl` varchar(20) DEFAULT NULL,
  `status_pl` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `saida_i`
--

CREATE TABLE `saida_i` (
  `id_ingrediente` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `id_lanche` int(11) NOT NULL,
  `criacao_s` varchar(20) DEFAULT NULL,
  `atualizacao_s` varchar(20) DEFAULT NULL,
  `status_s` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `tipo_u` enum('a','g','e','c') NOT NULL,
  `nome_u` varchar(255) NOT NULL,
  `foto_u` varchar(255) NOT NULL,
  `criacao_u` varchar(20) DEFAULT NULL,
  `atualizacao_u` varchar(20) DEFAULT NULL,
  `status_u` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`input_i`),
  ADD KEY `id_ingrediente` (`id_ingrediente`);

--
-- Índices de tabela `ingredientes`
--
ALTER TABLE `ingredientes`
  ADD PRIMARY KEY (`id_ingrediente`);

--
-- Índices de tabela `lanches`
--
ALTER TABLE `lanches`
  ADD PRIMARY KEY (`id_lanche`);

--
-- Índices de tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Índices de tabela `relacao_l_i`
--
ALTER TABLE `relacao_l_i`
  ADD PRIMARY KEY (`id_lanche`,`id_ingrediente`),
  ADD KEY `id_ingrediente` (`id_ingrediente`);

--
-- Índices de tabela `relacoes_p_l`
--
ALTER TABLE `relacoes_p_l`
  ADD PRIMARY KEY (`id_pedido`,`id_lanche`),
  ADD KEY `id_lanche` (`id_lanche`);

--
-- Índices de tabela `saida_i`
--
ALTER TABLE `saida_i`
  ADD PRIMARY KEY (`id_ingrediente`,`id_pedido`,`id_lanche`),
  ADD KEY `id_pedido` (`id_pedido`),
  ADD KEY `id_lanche` (`id_lanche`);

--
-- Índices de tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `ingredientes`
--
ALTER TABLE `ingredientes`
  MODIFY `id_ingrediente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `lanches`
--
ALTER TABLE `lanches`
  MODIFY `id_lanche` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `entradas_ibfk_1` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`);

--
-- Restrições para tabelas `relacao_l_i`
--
ALTER TABLE `relacao_l_i`
  ADD CONSTRAINT `relacao_l_i_ibfk_1` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`),
  ADD CONSTRAINT `relacao_l_i_ibfk_2` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`),
  ADD CONSTRAINT `relacao_l_i_ibfk_3` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`);

--
-- Restrições para tabelas `relacoes_p_l`
--
ALTER TABLE `relacoes_p_l`
  ADD CONSTRAINT `relacoes_p_l_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedidos` (`id_pedido`),
  ADD CONSTRAINT `relacoes_p_l_ibfk_2` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`);

--
-- Restrições para tabelas `saida_i`
--
ALTER TABLE `saida_i`
  ADD CONSTRAINT `saida_i_ibfk_1` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`),
  ADD CONSTRAINT `saida_i_ibfk_2` FOREIGN KEY (`id_pedido`) REFERENCES `pedidos` (`id_pedido`),
  ADD CONSTRAINT `saida_i_ibfk_3` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
