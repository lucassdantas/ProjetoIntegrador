-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12-Maio-2023 às 02:35
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

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
-- Estrutura da tabela `entradas`
--

CREATE TABLE `entradas` (
  `id_entrada` int(11) NOT NULL,
  `peso_e` float NOT NULL,
  `custo_e` float NOT NULL,
  `quantidade_e` int(11) NOT NULL,
  `criacao_e` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_e` timestamp NOT NULL DEFAULT current_timestamp(),
  `status_e` enum('a','n','d') NOT NULL,
  `id_ingrediente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingredientes`
--

CREATE TABLE `ingredientes` (
  `id_ingrediente` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `preco_i` float NOT NULL,
  `peso_i` float NOT NULL,
  `quantidade_i` int(11) NOT NULL,
  `tipo_i` enum('k','g','u') NOT NULL,
  `criacao_i` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_i` int(11) NOT NULL,
  `status_i` enum('n','l','e','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lanches`
--

CREATE TABLE `lanches` (
  `id_lanche` int(11) NOT NULL,
  `nome_l` varchar(255) NOT NULL,
  `custo_l` float NOT NULL,
  `preco_l` float NOT NULL,
  `peso_l` float NOT NULL,
  `criacao_l` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_l` timestamp NOT NULL DEFAULT current_timestamp(),
  `q_minima_l` int(11) NOT NULL,
  `status` enum('a','s','e','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `id_pedido` int(11) NOT NULL,
  `nome_p` varchar(255) NOT NULL,
  `valor_p` float NOT NULL,
  `criacao_p` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_p` timestamp NOT NULL DEFAULT current_timestamp(),
  `status_p` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `relacao_l_i`
--

CREATE TABLE `relacao_l_i` (
  `id_lanche` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  `quantidade_li` int(11) DEFAULT NULL,
  `peso_li` float DEFAULT NULL,
  `criacao_li` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_li` timestamp NOT NULL DEFAULT current_timestamp(),
  `status` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `relacoes_p_l`
--

CREATE TABLE `relacoes_p_l` (
  `id_pedido` int(11) NOT NULL,
  `id_lanche` int(11) NOT NULL,
  `criacao_pl` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_pl` timestamp NOT NULL DEFAULT current_timestamp(),
  `status_pl` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `saida_i`
--

CREATE TABLE `saida_i` (
  `id_ingrediente` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `id_lanche` int(11) NOT NULL,
  `criacao_s` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_s` timestamp NOT NULL DEFAULT current_timestamp(),
  `status_s` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `tipo_u` enum('a','g','e','c') NOT NULL,
  `nome_u` varchar(255) NOT NULL,
  `foto_u` varchar(255) NOT NULL,
  `criacao_u` timestamp NOT NULL DEFAULT current_timestamp(),
  `atualizacao_u` timestamp NOT NULL DEFAULT current_timestamp(),
  `status_u` enum('a','n','d') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`id_entrada`),
  ADD KEY `id_ingrediente` (`id_ingrediente`);

--
-- Índices para tabela `ingredientes`
--
ALTER TABLE `ingredientes`
  ADD PRIMARY KEY (`id_ingrediente`);

--
-- Índices para tabela `lanches`
--
ALTER TABLE `lanches`
  ADD PRIMARY KEY (`id_lanche`);

--
-- Índices para tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Índices para tabela `relacao_l_i`
--
ALTER TABLE `relacao_l_i`
  ADD PRIMARY KEY (`id_lanche`,`id_ingrediente`),
  ADD KEY `id_ingrediente` (`id_ingrediente`);

--
-- Índices para tabela `relacoes_p_l`
--
ALTER TABLE `relacoes_p_l`
  ADD PRIMARY KEY (`id_pedido`,`id_lanche`),
  ADD KEY `id_lanche` (`id_lanche`);

--
-- Índices para tabela `saida_i`
--
ALTER TABLE `saida_i`
  ADD PRIMARY KEY (`id_ingrediente`,`id_pedido`,`id_lanche`),
  ADD KEY `id_pedido` (`id_pedido`),
  ADD KEY `id_lanche` (`id_lanche`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `entradas`
--
ALTER TABLE `entradas`
  MODIFY `id_entrada` int(11) NOT NULL AUTO_INCREMENT;

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
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `entradas_ibfk_1` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`);

--
-- Limitadores para a tabela `relacao_l_i`
--
ALTER TABLE `relacao_l_i`
  ADD CONSTRAINT `relacao_l_i_ibfk_1` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`),
  ADD CONSTRAINT `relacao_l_i_ibfk_2` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`),
  ADD CONSTRAINT `relacao_l_i_ibfk_3` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`);

--
-- Limitadores para a tabela `relacoes_p_l`
--
ALTER TABLE `relacoes_p_l`
  ADD CONSTRAINT `relacoes_p_l_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedidos` (`id_pedido`),
  ADD CONSTRAINT `relacoes_p_l_ibfk_2` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`);

--
-- Limitadores para a tabela `saida_i`
--
ALTER TABLE `saida_i`
  ADD CONSTRAINT `saida_i_ibfk_1` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`),
  ADD CONSTRAINT `saida_i_ibfk_2` FOREIGN KEY (`id_pedido`) REFERENCES `pedidos` (`id_pedido`),
  ADD CONSTRAINT `saida_i_ibfk_3` FOREIGN KEY (`id_lanche`) REFERENCES `lanches` (`id_lanche`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
