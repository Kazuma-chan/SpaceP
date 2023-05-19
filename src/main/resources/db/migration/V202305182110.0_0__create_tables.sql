CREATE TABLE `media` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255),
  `media_type` varchar(255),
  `url` varchar(255),
  `explanation` longtext,
  `date` date,
  `pk_video` int,
  `pk_image` int,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`pk_video`) REFERENCES video(`video_id`)
  FOREIGN KEY (`pk_image`) REFERENCES image(`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `video` (
  `video_id` int NOT NULL AUTO_INCREMENT,
  `thumbnail` varchar(255),
  PRIMARY KEY (`video_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `image` (
  `image_id` int NOT NULL AUTO_INCREMENT,
  `hdurl` varchar(255),
  PRIMARY KEY (`image_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;