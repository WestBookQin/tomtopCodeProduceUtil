package entity;

public class EntityVar {

	private String entitySimpleName;
	private String primaryKeyType;

	public EntityVar() {
		super();
	}

	public EntityVar(String entitySimpleName) {
		super();
		this.entitySimpleName = entitySimpleName;
	}

	public EntityVar(String entitySimpleName, String primaryKeyType) {
		super();
		this.entitySimpleName = entitySimpleName;
		this.primaryKeyType = primaryKeyType;
	}

	public String getEntitySimpleName() {
		return entitySimpleName;
	}

	public String getPrimaryKeyType() {
		return primaryKeyType;
	}

	public void setEntitySimpleName(String entitySimpleName) {
		this.entitySimpleName = entitySimpleName;
	}

	public void setPrimaryKeyType(String primaryKeyType) {
		this.primaryKeyType = primaryKeyType;
	}

}
