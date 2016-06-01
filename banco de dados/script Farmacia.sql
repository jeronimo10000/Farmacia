SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `farmacia` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `farmacia` ;

-- -----------------------------------------------------
-- Table `farmacia`.`funcionarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`funcionarios` (
  `idfuncionarios` INT NOT NULL AUTO_INCREMENT,
  `nomeFuncionario` VARCHAR(50) NOT NULL,
  `cpfFuncionario` INT NOT NULL,
  `telefone` INT NOT NULL,
  `endereco` VARCHAR(250) NOT NULL,
  `salarioBase` DOUBLE NOT NULL,
  PRIMARY KEY (`idfuncionarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`clientes` (
  `idclientes` INT NOT NULL,
  `cpfCliente` INT NOT NULL,
  `nomeCliente` VARCHAR(250) NOT NULL,
  `enderecoCliente` VARCHAR(250) NOT NULL,
  `telefoneCliente` INT NOT NULL,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`fornecedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`fornecedores` (
  `idfornecedores` INT NOT NULL,
  `descFornecedor` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`idfornecedores`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`fabricante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`fabricante` (
  `idfabricante` INT NOT NULL,
  `descFabricante` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`idfabricante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`produtos` (
  `idprodutos` INT NOT NULL,
  `valorUnitario` DOUBLE NOT NULL,
  `descProduto` VARCHAR(250) NOT NULL,
  `fornecedores_idfornecedores` INT NOT NULL,
  `fabricante_idfabricante` INT NOT NULL,
  PRIMARY KEY (`idprodutos`, `fornecedores_idfornecedores`, `fabricante_idfabricante`),
  INDEX `fk_produtos_fornecedores1_idx` (`fornecedores_idfornecedores` ASC),
  INDEX `fk_produtos_fabricante1_idx` (`fabricante_idfabricante` ASC),
  CONSTRAINT `fk_produtos_fornecedores1`
    FOREIGN KEY (`fornecedores_idfornecedores`)
    REFERENCES `farmacia`.`fornecedores` (`idfornecedores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_produtos_fabricante1`
    FOREIGN KEY (`fabricante_idfabricante`)
    REFERENCES `farmacia`.`fabricante` (`idfabricante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`itensPedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`itensPedidos` (
  `qtdItens` INT NOT NULL,
  `produtos_idprodutos` INT NOT NULL,
  `produtos_fornecedores_idfornecedores` INT NOT NULL,
  `produtos_fabricante_idfabricante` INT NOT NULL,
  PRIMARY KEY (`produtos_idprodutos`, `produtos_fornecedores_idfornecedores`, `produtos_fabricante_idfabricante`),
  CONSTRAINT `fk_itensPedidos_produtos1`
    FOREIGN KEY (`produtos_idprodutos` , `produtos_fornecedores_idfornecedores` , `produtos_fabricante_idfabricante`)
    REFERENCES `farmacia`.`produtos` (`idprodutos` , `fornecedores_idfornecedores` , `fabricante_idfabricante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `farmacia`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `farmacia`.`pedidos` (
  `idpedidos` INT NOT NULL,
  `descPedido` TEXT NULL,
  `valorTotal` DOUBLE NOT NULL,
  `funcionarios_idfuncionarios` INT NOT NULL,
  `clientes_idclientes` INT NOT NULL,
  `itensPedidos_produtos_idprodutos` INT NOT NULL,
  `itensPedidos_produtos_fornecedores_idfornecedores` INT NOT NULL,
  `itensPedidos_produtos_fabricante_idfabricante` INT NOT NULL,
  PRIMARY KEY (`idpedidos`, `funcionarios_idfuncionarios`, `clientes_idclientes`, `itensPedidos_produtos_idprodutos`, `itensPedidos_produtos_fornecedores_idfornecedores`, `itensPedidos_produtos_fabricante_idfabricante`),
  INDEX `fk_pedidos_funcionarios_idx` (`funcionarios_idfuncionarios` ASC),
  INDEX `fk_pedidos_clientes1_idx` (`clientes_idclientes` ASC),
  INDEX `fk_pedidos_itensPedidos1_idx` (`itensPedidos_produtos_idprodutos` ASC, `itensPedidos_produtos_fornecedores_idfornecedores` ASC, `itensPedidos_produtos_fabricante_idfabricante` ASC),
  CONSTRAINT `fk_pedidos_funcionarios`
    FOREIGN KEY (`funcionarios_idfuncionarios`)
    REFERENCES `farmacia`.`funcionarios` (`idfuncionarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_clientes1`
    FOREIGN KEY (`clientes_idclientes`)
    REFERENCES `farmacia`.`clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_itensPedidos1`
    FOREIGN KEY (`itensPedidos_produtos_idprodutos` , `itensPedidos_produtos_fornecedores_idfornecedores` , `itensPedidos_produtos_fabricante_idfabricante`)
    REFERENCES `farmacia`.`itensPedidos` (`produtos_idprodutos` , `produtos_fornecedores_idfornecedores` , `produtos_fabricante_idfabricante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
