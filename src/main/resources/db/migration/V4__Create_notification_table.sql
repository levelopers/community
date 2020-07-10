CREATE TABLE NOTIFICATION
(
 "NOTIFICATION_ID" bigserial NOT NULL,
 "MESSAGE"         varchar(256) NOT NULL,
 "GMT_CREATE"      bigint NOT NULL,
 "IS_READ"         boolean default false NOT NULL,
 "REDIRECT_URI"    varchar(50) NOT NULL,
 "SENDER_ID"       bigint NOT NULL,
 "RECEIVER_ID"     bigint NOT NULL,
 CONSTRAINT "PK_Notification" PRIMARY KEY ( "NOTIFICATION_ID" ),
 CONSTRAINT "FK_201" FOREIGN KEY ( "SENDER_ID" ) REFERENCES t_user ( "USER_ID" ),
 CONSTRAINT "FK_204" FOREIGN KEY ( "RECEIVER_ID" ) REFERENCES t_user ( "USER_ID" )
);

CREATE INDEX "fkIdx_201" ON NOTIFICATION
(
 "SENDER_ID"
);

CREATE INDEX "fkIdx_204" ON NOTIFICATION
(
 "RECEIVER_ID"
);
