class IllegalTenantException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IllegalTenantException(String exception){
	    super(exception);
	  }
}