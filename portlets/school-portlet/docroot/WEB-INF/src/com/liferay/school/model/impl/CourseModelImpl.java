/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.school.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.school.model.Course;
import com.liferay.school.model.CourseModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Course service. Represents a row in the &quot;SCH_Course&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.school.model.CourseModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CourseImpl}.
 * </p>
 *
 * @author dnebinger
 * @see CourseImpl
 * @see com.liferay.school.model.Course
 * @see com.liferay.school.model.CourseModel
 * @generated
 */
public class CourseModelImpl extends BaseModelImpl<Course>
	implements CourseModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a course model instance should use the {@link com.liferay.school.model.Course} interface instead.
	 */
	public static final String TABLE_NAME = "SCH_Course";
	public static final Object[][] TABLE_COLUMNS = {
			{ "courseId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "courseCode", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "level", Types.INTEGER },
			{ "department", Types.VARCHAR },
			{ "prereqs", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table SCH_Course (courseId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,courseCode VARCHAR(75) null,name VARCHAR(75) null,description VARCHAR(75) null,level INTEGER,department VARCHAR(75) null,prereqs VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table SCH_Course";
	public static final String ORDER_BY_JPQL = " ORDER BY course.courseCode ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SCH_Course.courseCode ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.school.model.Course"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.school.model.Course"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.school.model.Course"),
			true);
	public static long COURSECODE_COLUMN_BITMASK = 1L;
	public static long DEPARTMENT_COLUMN_BITMASK = 2L;
	public static long NAME_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.school.model.Course"));

	public CourseModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _courseId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCourseId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _courseId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Course.class;
	}

	@Override
	public String getModelClassName() {
		return Course.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("courseId", getCourseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("courseCode", getCourseCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("level", getLevel());
		attributes.put("department", getDepartment());
		attributes.put("prereqs", getPrereqs());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String courseCode = (String)attributes.get("courseCode");

		if (courseCode != null) {
			setCourseCode(courseCode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String prereqs = (String)attributes.get("prereqs");

		if (prereqs != null) {
			setPrereqs(prereqs);
		}
	}

	@Override
	public long getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(long courseId) {
		_courseId = courseId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getCourseCode() {
		if (_courseCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _courseCode;
		}
	}

	@Override
	public void setCourseCode(String courseCode) {
		_columnBitmask = -1L;

		if (_originalCourseCode == null) {
			_originalCourseCode = _courseCode;
		}

		_courseCode = courseCode;
	}

	public String getOriginalCourseCode() {
		return GetterUtil.getString(_originalCourseCode);
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_level = level;
	}

	@Override
	public String getDepartment() {
		if (_department == null) {
			return StringPool.BLANK;
		}
		else {
			return _department;
		}
	}

	@Override
	public void setDepartment(String department) {
		_columnBitmask |= DEPARTMENT_COLUMN_BITMASK;

		if (_originalDepartment == null) {
			_originalDepartment = _department;
		}

		_department = department;
	}

	public String getOriginalDepartment() {
		return GetterUtil.getString(_originalDepartment);
	}

	@Override
	public String getPrereqs() {
		if (_prereqs == null) {
			return StringPool.BLANK;
		}
		else {
			return _prereqs;
		}
	}

	@Override
	public void setPrereqs(String prereqs) {
		_prereqs = prereqs;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Course.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Course toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Course)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CourseImpl courseImpl = new CourseImpl();

		courseImpl.setCourseId(getCourseId());
		courseImpl.setGroupId(getGroupId());
		courseImpl.setCompanyId(getCompanyId());
		courseImpl.setUserId(getUserId());
		courseImpl.setUserName(getUserName());
		courseImpl.setCreateDate(getCreateDate());
		courseImpl.setModifiedDate(getModifiedDate());
		courseImpl.setCourseCode(getCourseCode());
		courseImpl.setName(getName());
		courseImpl.setDescription(getDescription());
		courseImpl.setLevel(getLevel());
		courseImpl.setDepartment(getDepartment());
		courseImpl.setPrereqs(getPrereqs());

		courseImpl.resetOriginalValues();

		return courseImpl;
	}

	@Override
	public int compareTo(Course course) {
		int value = 0;

		value = getCourseCode().compareTo(course.getCourseCode());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Course)) {
			return false;
		}

		Course course = (Course)obj;

		long primaryKey = course.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		CourseModelImpl courseModelImpl = this;

		courseModelImpl._originalCourseCode = courseModelImpl._courseCode;

		courseModelImpl._originalName = courseModelImpl._name;

		courseModelImpl._originalDepartment = courseModelImpl._department;

		courseModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Course> toCacheModel() {
		CourseCacheModel courseCacheModel = new CourseCacheModel();

		courseCacheModel.courseId = getCourseId();

		courseCacheModel.groupId = getGroupId();

		courseCacheModel.companyId = getCompanyId();

		courseCacheModel.userId = getUserId();

		courseCacheModel.userName = getUserName();

		String userName = courseCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			courseCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			courseCacheModel.createDate = createDate.getTime();
		}
		else {
			courseCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			courseCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			courseCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		courseCacheModel.courseCode = getCourseCode();

		String courseCode = courseCacheModel.courseCode;

		if ((courseCode != null) && (courseCode.length() == 0)) {
			courseCacheModel.courseCode = null;
		}

		courseCacheModel.name = getName();

		String name = courseCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			courseCacheModel.name = null;
		}

		courseCacheModel.description = getDescription();

		String description = courseCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			courseCacheModel.description = null;
		}

		courseCacheModel.level = getLevel();

		courseCacheModel.department = getDepartment();

		String department = courseCacheModel.department;

		if ((department != null) && (department.length() == 0)) {
			courseCacheModel.department = null;
		}

		courseCacheModel.prereqs = getPrereqs();

		String prereqs = courseCacheModel.prereqs;

		if ((prereqs != null) && (prereqs.length() == 0)) {
			courseCacheModel.prereqs = null;
		}

		return courseCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{courseId=");
		sb.append(getCourseId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", courseCode=");
		sb.append(getCourseCode());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", prereqs=");
		sb.append(getPrereqs());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.school.model.Course");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseCode</column-name><column-value><![CDATA[");
		sb.append(getCourseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prereqs</column-name><column-value><![CDATA[");
		sb.append(getPrereqs());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Course.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Course.class };
	private long _courseId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _courseCode;
	private String _originalCourseCode;
	private String _name;
	private String _originalName;
	private String _description;
	private int _level;
	private String _department;
	private String _originalDepartment;
	private String _prereqs;
	private long _columnBitmask;
	private Course _escapedModel;
}