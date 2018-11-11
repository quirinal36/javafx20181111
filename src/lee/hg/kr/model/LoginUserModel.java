package lee.hg.kr.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javafx.beans.property.StringProperty;

public class LoginUserModel {
	private StringProperty id;
	private StringProperty pwd;


	public StringProperty getId() {
		return id;
	}

	public void setId(StringProperty id) {
		this.id = id;
	}

	public StringProperty getPwd() {
		return pwd;
	}

	public void setPwd(StringProperty pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
