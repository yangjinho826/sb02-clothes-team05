CREATE TABLE "clothes" (
    "id"         UUID           NOT NULL,
    "author_id"  UUID           NOT NULL,
    "name"       VARCHAR(255)   NOT NULL,
    "type"       VARCHAR(50)    NULL,
    "image_url"  VARCHAR(255)   NULL,
    "created_at" TIMESTAMP      NULL
);

CREATE TABLE "clothes_attribute_defs" (
    "id"                UUID           NOT NULL,
    "name"              VARCHAR(255)   NOT NULL,
    "selectable_values" JSONB          NULL,
    "created_at"        TIMESTAMP      NULL
);

CREATE TABLE "clothes_attributes" (
    "id"           UUID           NOT NULL,
    "clothes_id"   UUID           NOT NULL,
    "definition_id" UUID          NOT NULL,
    "value"        VARCHAR(255)   NOT NULL
);

CREATE TABLE "direct_messages" (
    "id"          UUID        NOT NULL,
    "sender_id"   UUID        NOT NULL,
    "receiver_id" UUID        NOT NULL,
    "content"     TEXT        NULL,
    "created_at"  TIMESTAMP   NULL
);

CREATE TABLE "feed_comments" (
    "id"         UUID        NOT NULL,
    "feed_id"    UUID        NOT NULL,
    "author_id"  UUID        NOT NULL,
    "content"    TEXT        NULL,
    "created_at" TIMESTAMP   NULL,
    "updated_at" TIMESTAMP   NULL
);

CREATE TABLE "feed_likes" (
    "id"         UUID        NOT NULL,
    "author_id"  UUID        NOT NULL,
    "feed_id"    UUID        NOT NULL,
    "created_at" TIMESTAMP   NULL,
    "updated_at" TIMESTAMP   NULL
);

CREATE TABLE "feeds" (
    "id"         UUID        NOT NULL,
    "author_id"  UUID        NOT NULL,
    "weather_id" UUID        NOT NULL,
    "content"    TEXT        NULL,
    "created_at" TIMESTAMP   NULL,
    "updated_at" TIMESTAMP   NULL
);

CREATE TABLE "follow_summary" (
    "id"              UUID        NOT NULL,
    "user_id"         UUID        NOT NULL,
    "follower_count"  INT         NULL,
    "following_count" INT         NULL
);

CREATE TABLE "follows" (
    "id"          UUID        NOT NULL,
    "follower_id" UUID        NOT NULL,
    "followee_id" UUID        NOT NULL,
    "created_at"  TIMESTAMP   NULL
);

CREATE TABLE "notifications" (
    "id"          UUID          NOT NULL,
    "receiver_id" UUID          NOT NULL,
    "title"       VARCHAR(255)  NULL,
    "content"     TEXT          NULL,
    "level"       VARCHAR(50)   NULL,
    "created_at"  TIMESTAMP     NULL
);

CREATE TABLE "ootd_feed_items" (
    "feed_id"    UUID        NOT NULL,
    "clothes_id" UUID        NOT NULL
);

CREATE TABLE "recommendations" (
    "id"         UUID        NOT NULL,
    "user_id"    UUID        NOT NULL,
    "weather_id" UUID        NOT NULL,
    "clothes"    JSONB       NULL,
    "created_at" TIMESTAMP   NULL
);

CREATE TABLE "user_profiles" (
    "id"                       UUID          NOT NULL,
    "user_id"                  UUID          NOT NULL,
    "gender"                   VARCHAR(50)   NULL,
    "birth_date"               DATE          NULL,
    "location"                 JSONB         NULL,
    "temperature_sensitivity"  INT           NULL,
    "profile_image_url"        VARCHAR(255)  NULL
);

CREATE TABLE "users" (
    "id"         UUID           NOT NULL,
    "name"       VARCHAR(255)   NULL,
    "email"      VARCHAR(255)   NOT NULL,
    "password"   VARCHAR(255)   NOT NULL,
    "role"       VARCHAR(50)    NULL,
    "locked"     BOOLEAN        NULL,
    "created_at" TIMESTAMP      NULL
);

CREATE TABLE "weather" (
    "id"             UUID          NOT NULL,
    "forecasted_at"  TIMESTAMP     NULL,
    "forecast_at"    TIMESTAMP     NULL,
    "location"       JSONB         NULL,
    "sky_status"     VARCHAR(50)   NULL,
    "temperature"    JSONB         NULL,
    "humidity"       JSONB         NULL,
    "precipitation"  JSONB         NULL,
    "wind_speed"     JSONB         NULL,
    "created_at"     TIMESTAMP     NULL
);

-- ===================
-- PRIMARY KEY ALTERs
-- ===================
ALTER TABLE "clothes"                ADD CONSTRAINT "PK_CLOTHES"                PRIMARY KEY ("id");
ALTER TABLE "clothes_attribute_defs" ADD CONSTRAINT "PK_CLOTHES_ATTRIBUTE_DEFS" PRIMARY KEY ("id");
ALTER TABLE "clothes_attributes"     ADD CONSTRAINT "PK_CLOTHES_ATTRIBUTES"     PRIMARY KEY ("id");
ALTER TABLE "direct_messages"        ADD CONSTRAINT "PK_DIRECT_MESSAGES"        PRIMARY KEY ("id");
ALTER TABLE "feed_comments"          ADD CONSTRAINT "PK_FEED_COMMENTS"          PRIMARY KEY ("id");
ALTER TABLE "feed_likes"             ADD CONSTRAINT "PK_FEED_LIKES"             PRIMARY KEY ("id");
ALTER TABLE "feeds"                  ADD CONSTRAINT "PK_FEEDS"                  PRIMARY KEY ("id");
ALTER TABLE "follow_summary"         ADD CONSTRAINT "PK_FOLLOW_SUMMARY"         PRIMARY KEY ("id");
ALTER TABLE "follows"                ADD CONSTRAINT "PK_FOLLOWS"                PRIMARY KEY ("id");
ALTER TABLE "notifications"          ADD CONSTRAINT "PK_NOTIFICATIONS"          PRIMARY KEY ("id");
ALTER TABLE "recommendations"        ADD CONSTRAINT "PK_RECOMMENDATIONS"        PRIMARY KEY ("id");
ALTER TABLE "user_profiles"          ADD CONSTRAINT "PK_USER_PROFILES"          PRIMARY KEY ("id");
ALTER TABLE "users"                  ADD CONSTRAINT "PK_USERS"                  PRIMARY KEY ("id");
ALTER TABLE "weather"                ADD CONSTRAINT "PK_WEATHER"                PRIMARY KEY ("id");
