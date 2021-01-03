

INSERT INTO `OUTBRAIN_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'OUTBRAIN' ;

INSERT INTO `TABOOLA_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'TABOOLA'
   OR DISTRIBUTION = 'TABOOLA_3RD_PARTY';

INSERT INTO `TRADEDESK_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'TRADEDESK'
   OR DISTRIBUTION = 'TRADEDESK_CONTEXTUAL'
   OR DISTRIBUTION = 'TRADEDESK_DMP';

INSERT INTO `YAHOO_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'OATH_AUDIENCE'
   OR DISTRIBUTION = 'OATH_3RDPARTY'
   OR DISTRIBUTION = 'YAHOO';

INSERT INTO `ZEMANTA_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'ZEMANTA',
   OR DISTRIBUTION = 'BLUEKAI';

INSERT INTO `FACEBOOK_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'FACEBOOK';

INSERT INTO `REVCONTENT_INTEREST_LIST`
SELECT * FROM `INTEREST_LIST`
WHERE DISTRIBUTION = 'REVCONTENT';






