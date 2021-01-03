

CREATE TABLE `OUTBRAIN_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `TABOOLA_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `TRADEDESK_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `YAHOO_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `ZEMANTA_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `FACEBOOK_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `REVCONTENT_INTEREST_LIST` (
  `interest_name` varchar(128) CHARACTER SET latin1 NOT NULL,
  `interest_code` varchar(64) CHARACTER SET latin1 NOT NULL,
  `DISTRIBUTION` varchar(64) CHARACTER SET latin1 NOT NULL,
  `IAB_CODE` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `REACH` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `parent_code` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `DESCRIPTION` text,
  `PATH` varchar(1000) DEFAULT NULL,
  `ACTIVE` tinyint(1) NOT NULL DEFAULT '1',
  `CATEGORY_TYPE` varchar(64) CHARACTER SET latin1 DEFAULT NULL,
  `EXTRA_COST_PERCENTAGE` varchar(8) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of creation of the record',
  `UPDATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'timestamp of the last update on the record',
  PRIMARY KEY (`interest_name`,`interest_code`,`DISTRIBUTION`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
