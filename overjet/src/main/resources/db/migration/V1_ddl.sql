CREATE DATABASE IF NOT EXISTS `patient_info`; 

USE `patient_info`; 

CREATE TABLE IF NOT EXISTS `patient_issues`( `issue_id` INT NOT NULL AUTO_INCREMENT , `issue_desc` TEXT(1000) NOT NULL , `bodypart` VARCHAR(100) NOT NULL , `visit_id` VARCHAR(50), PRIMARY KEY (`issue_id`) ); 

CREATE TABLE IF NOT EXISTS `patient_visits`( `patient_id` VARCHAR(50) NOT NULL , `hospital_id` VARCHAR(50) , `visit_id` VARCHAR(50), `documents` TEXT(1000) , PRIMARY KEY (`visit_id`) ); 

ALTER TABLE `patient_issues` ADD CONSTRAINT `FK_patient_issues` FOREIGN KEY (`visit_id`) REFERENCES `patient_visits` (`visit_id`) ON DELETE CASCADE ON UPDATE NO ACTION ;