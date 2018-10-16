-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.1.63-community-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para acolhimento
CREATE DATABASE IF NOT EXISTS `acolhimento` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `acolhimento`;

-- Copiando estrutura para tabela acolhimento.chamada
CREATE TABLE IF NOT EXISTS `chamada` (
  `idChamadaData` date NOT NULL,
  `nProntuarioUsu` int(11) unsigned NOT NULL,
  `falta` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idChamadaData`,`nProntuarioUsu`),
  KEY `FK_Chamada_Usuario` (`nProntuarioUsu`),
  CONSTRAINT `FK1_Chamada_Usuario` FOREIGN KEY (`nProntuarioUsu`) REFERENCES `usuario` (`nProntuarioUsu`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela acolhimento.empresa
CREATE TABLE IF NOT EXISTS `empresa` (
  `cnpjEmp` varchar(20) NOT NULL,
  `nomeEmp` varchar(20) NOT NULL,
  `numeroVagasEmp` smallint(6) NOT NULL,
  `razaoSocialEmp` varchar(60) DEFAULT NULL,
  `idEndereco` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`cnpjEmp`),
  KEY `FK_Empresa_Endereco` (`idEndereco`),
  CONSTRAINT `FK1_Empresa_Endereco` FOREIGN KEY (`idEndereco`) REFERENCES `endereco` (`idEndereco`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela acolhimento.encaminhamento
CREATE TABLE IF NOT EXISTS `encaminhamento` (
  `idEnc` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `tipoEnc` varchar(40) NOT NULL,
  `localEnc` varchar(50) DEFAULT NULL,
  `statusEnc` varchar(20) DEFAULT NULL,
  `cpfFunc` varchar(20) NOT NULL,
  `nProntuarioUsu` int(11) unsigned NOT NULL,
  `dataEnc` date DEFAULT NULL,
  `idEndereco` int(11) unsigned NOT NULL,
  PRIMARY KEY (`idEnc`),
  KEY `FK_Encaminhamento_Funcionario` (`cpfFunc`),
  KEY `FK_Encaminhamento_Usuario` (`nProntuarioUsu`),
  KEY `FK_Encaminhamento_Endereco` (`idEndereco`),
  CONSTRAINT `FK1_Encaminhamento_Funcionario` FOREIGN KEY (`cpfFunc`) REFERENCES `funcionario` (`cpfFunc`) ON UPDATE CASCADE,
  CONSTRAINT `FK2_Encaminhamento_Usuario` FOREIGN KEY (`nProntuarioUsu`) REFERENCES `usuario` (`nProntuarioUsu`) ON UPDATE CASCADE,
  CONSTRAINT `FK3_Encaminhamento_Endereco` FOREIGN KEY (`idEndereco`) REFERENCES `endereco` (`idEndereco`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela acolhimento.endereco
CREATE TABLE IF NOT EXISTS `endereco` (
  `idEndereco` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `endereco` varchar(60) DEFAULT NULL,
  `numeroEnd` smallint(6) DEFAULT NULL,
  `bairro` varchar(30) DEFAULT NULL,
  `cidade` varchar(30) DEFAULT NULL,
  `cep` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idEndereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela acolhimento.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `cpfFunc` varchar(20) NOT NULL,
  `nomeFunc` varchar(30) NOT NULL,
  `rgFunc` varchar(15) NOT NULL,
  `dataNascFunc` date NOT NULL,
  `telefoneFunc` varchar(20) NOT NULL,
  `emailFunc` varchar(40) DEFAULT NULL,
  `tipoFunc` varchar(12) NOT NULL,
  `statusFunc` varchar(10) NOT NULL,
  `idEndereco` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`cpfFunc`),
  KEY `FK_Funcionario_Endereco` (`idEndereco`),
  CONSTRAINT `FK_Funcionario_Endereco` FOREIGN KEY (`idEndereco`) REFERENCES `endereco` (`idEndereco`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela acolhimento.log
CREATE TABLE IF NOT EXISTS `log` (
  `idLog` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `dataLogin` date NOT NULL,
  `dataLogoff` date NOT NULL,
  `tipoEntradaOuAlteração` varchar(40) DEFAULT NULL,
  `tipoRelatorioGerado` varchar(20) DEFAULT NULL,
  `cpfFunc` varchar(20) NOT NULL,
  PRIMARY KEY (`idLog`),
  KEY `FK_Log_Funcionario` (`cpfFunc`),
  CONSTRAINT `FK1_Log_Funcionario` FOREIGN KEY (`cpfFunc`) REFERENCES `funcionario` (`cpfFunc`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela acolhimento.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `nProntuarioUsu` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `tipoUsu` varchar(10) NOT NULL,
  `dataCadastroUsu` date NOT NULL,
  `nomeUsu` varchar(30) NOT NULL,
  `statusUsu` varchar(10) NOT NULL,
  `sexoUsu` varchar(10) NOT NULL,
  `dataNascUsu` date DEFAULT NULL,
  `tipoDoc` varchar(10) NOT NULL,
  `documentoUsu` varchar(50) DEFAULT NULL,
  `cidadeOrigemUsu` varchar(30) DEFAULT NULL,
  `atendidoPeloFunc` varchar(30) NOT NULL,
  `parecerTecnicoUsu` varchar(200) DEFAULT NULL,
  `drogasUsadasUsu` varchar(100) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  `ultimaCidade` varchar(30) DEFAULT NULL,
  `cidadeDestino` varchar(30) DEFAULT NULL,
  `dataDeEntrada` date DEFAULT NULL,
  `dataDeSaida` date DEFAULT NULL,
  `cpfFunc` varchar(20) DEFAULT NULL,
  `idEndereco` int(11) DEFAULT NULL,
  PRIMARY KEY (`nProntuarioUsu`),
  KEY `FK_Usuario_Funcionario` (`cpfFunc`),
  KEY `FK_Usuario_Endereco` (`idEndereco`),
  KEY `FK3_Usuario_Funcionario2` (`atendidoPeloFunc`),
  CONSTRAINT `FK1_Usuario_Funcionario` FOREIGN KEY (`cpfFunc`) REFERENCES `funcionario` (`cpfFunc`) ON UPDATE CASCADE,
  CONSTRAINT `FK3_Usuario_Funcionario2` FOREIGN KEY (`atendidoPeloFunc`) REFERENCES `funcionario` (`cpfFunc`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
