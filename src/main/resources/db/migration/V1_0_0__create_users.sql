CREATE TABLE `soepergoedang`.`users` ( `id` INT NOT NULL AUTO_INCREMENT , `user_name` VARCHAR(64) NOT NULL , `full_name` TINYTEXT NULL DEFAULT NULL , `password` VARCHAR(255) NOT NULL , `user_role_id` INT NULL DEFAULT NULL , `user_status_id` INT NULL DEFAULT NULL , `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updated_at` TIMESTAMP NULL DEFAULT NULL , `deleted_at` TIMESTAMP NULL DEFAULT NULL , PRIMARY KEY (`id`));