
INSERT INTO t_user (username,password,AVATAR_URL) VALUES ('zack',
'$2a$10$VpsnPMGEEi4LmqBSKeqVXep4VHwkG1luPtrEewN1d6mkAjCUK1Fs6',
'https://storage.googleapis.com/spring-forum-1cec4.appspot.com/images/profile.jfif?GoogleAccessId=firebase-adminsdk-t4is3@spring-forum-1cec4.iam.gserviceaccount.com&Expires=1623528086&Signature=PrXxWQHWKDTKzvHNRehKJo9k3HLXm%2FnCAZYDmBMNCOXmv86yvSZg8z%2FL7Ul%2F7PAbsUjub%2BoOKLY8hY4V9tyRkct%2F7WbAPMJhsSzO7qXleHZg6QeExnHqB9PwFUENuAD2ctfXDqmpbvdiRbj5YRHFcb9lDzYHiLhovGhxBcj7E3B2IzyC%2FL%2FrMlYyYuhxi0s%2BBHZake4GYek780kmiSufCnFvhWiqQaSY3MZ1zrp0%2BsZ1LW%2BGs4TPWPjmcVK0S5rK7iZ2gh4sptgzrtitGI2UwyzoW0yNplvU0W6QWFAYQHz6YGeWquluh4stV41v6jEbziU9hKYdlNVV92zms8fngA%3D%3D');
INSERT INTO t_user (username,password,AVATAR_URL) VALUES ('allen',
'$2a$10$VpsnPMGEEi4LmqBSKeqVXep4VHwkG1luPtrEewN1d6mkAjCUK1Fs6',
'https://storage.googleapis.com/spring-forum-1cec4.appspot.com/images/profile1.jfif?GoogleAccessId=firebase-adminsdk-t4is3@spring-forum-1cec4.iam.gserviceaccount.com&Expires=1623528500&Signature=aAsgX9iJ0%2FQvbDSfQRZxZgN1Gbc8uU%2FUZANNbFVyeO8YwUMjDOZxz29IEZeLIUKQW9p8L71qDqvvPzxHnBfVW9pNeGVdsf2SZKi1nMaicPcBlfP4Ymivl07O17eaEOKBBQB4d74ksBOCvHPwf%2BlOMLtmfJUQ0SIomOP8awXRhlZPiH7eHa9jcRuHxHkafSXAFBMsKQjT4U0SKUFU9kANjzY2XRxVb5Bd5x8IESaRGUHShbgsuFq06dRDvZgzdTpTpSb0r7OA62IvEeTBJT5sa0yxJlgbZKsuQG1ynFtdqo5ll%2Bq8tfbWy3Br55hVGwHD9dIzstSEyr7WvLt8qmfNYw%3D%3D');

INSERT INTO QUESTION (
TITLE,
DESCRIPTION,
GMT_CREATE,
GMT_MODIFIED,
CREATOR,
COMMENT_COUNT,
VIEW_COUNT,
LIKE_COUNT,
TAG) VALUES (
'question1',
'this is a description',
1585385895854,
1585385895854,
1,
2,
1,
1,
'tag1'
);


INSERT INTO QUESTION (
TITLE,
DESCRIPTION,
GMT_CREATE,
GMT_MODIFIED,
CREATOR,
COMMENT_COUNT,
VIEW_COUNT,
LIKE_COUNT,
TAG) VALUES (
'question2',
'this is a description',
1585385895854,
1585385895854,
2,
0,
2,
2,
'tag1,tag2'
);

INSERT INTO COMMENT (
PARENT_ID,
TYPE,
COMMENTATOR,
GMT_CREATE,
GMT_MODIFIED,
LIKE_COUNT,
CONTENT,
COMMENT_COUNT) VALUES (
1,
1,
1,
1585385895854,
1585385895854,
12,
'1st comment to question 1',
0
);


INSERT INTO COMMENT (
PARENT_ID,
TYPE,
COMMENTATOR,
GMT_CREATE,
GMT_MODIFIED,
LIKE_COUNT,
CONTENT,
COMMENT_COUNT) VALUES (
1,
1,
2,
1585385895854,
1585385895854,
13,
'2nd comment to question 1',
1
);

INSERT INTO COMMENT (
PARENT_ID,
TYPE,
COMMENTATOR,
GMT_CREATE,
GMT_MODIFIED,
LIKE_COUNT,
CONTENT,
COMMENT_COUNT) VALUES (
2,
2,
1,
1585385895854,
1585385895854,
13,
'1st comment to comment 2',
0
);