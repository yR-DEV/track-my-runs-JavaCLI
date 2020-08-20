CREATE SCHEMA runs;

USE runs;

CREATE TABLE run(
	run_id INT AUTO_INCREMENT PRIMARY KEY,
    run_distance DOUBLE NOT NULL,
    run_description VARCHAR(80)
);

INSERT INTO run(run_distance, run_description) VALUES (3.1, "Cool and morning run. Easier than mid-day.");
INSERT INTO run(run_distance, run_description) VALUES (1.45, "Middle of the day, hot on the beach, humid.");
INSERT INTO run(run_distance, run_description) VALUES (2, "Ran with Audrey, best time of life.");

SELECT * FROM run;