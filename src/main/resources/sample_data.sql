-- Feature toggle sample table
-- ===========================
-- `key` column should be VARCHAR/STRING type
-- `value` column should be BOOLEAN type

CREATE TABLE IF NOT EXISTS public.feature_toggles (
	"key" varchar(64) NOT NULL,
	value BOOLEAN NOT NULL,
	CONSTRAINT feature_toggles_pkey PRIMARY KEY ("key")
);

INSERT INTO feature_toggles (key, value) VALUES ('ping',true);