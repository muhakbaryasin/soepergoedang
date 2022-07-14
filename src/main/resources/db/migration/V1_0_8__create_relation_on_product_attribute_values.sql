ALTER TABLE `product_attribute_values` ADD CONSTRAINT `product_attribute_values_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `product_attribute_values` ADD CONSTRAINT `product_attribute_values_ibfk_2` FOREIGN KEY (`product_attribute_name_id`) REFERENCES `product_attribute_names`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;