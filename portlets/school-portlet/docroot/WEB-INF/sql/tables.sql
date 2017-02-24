create table SCH_Course (
	courseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	courseCode VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	level INTEGER,
	department VARCHAR(75) null,
	prereqs VARCHAR(75) null
);