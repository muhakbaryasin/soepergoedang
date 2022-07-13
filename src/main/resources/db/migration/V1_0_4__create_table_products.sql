CREATE TABLE `products` ( `id` INT NOT NULL AUTO_INCREMENT , `code` VARCHAR(64) NOT NULL , `name` VARCHAR(512) NOT NULL , `description` TEXT NULL , `content_item_quantity` INT NOT NULL DEFAULT '1' , `packet_package_type_id` INT NULL , `content_product_id` INT NULL , `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updated_at` TIMESTAMP NULL , PRIMARY KEY (`id`));