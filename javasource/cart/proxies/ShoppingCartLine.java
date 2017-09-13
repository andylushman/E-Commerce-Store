// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cart.proxies;

public class ShoppingCartLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject shoppingCartLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Cart.ShoppingCartLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Quanity("Quanity"),
		SellingPrice("SellingPrice"),
		LineValue("LineValue"),
		ShoppingCartLine_ShoppingCart("Cart.ShoppingCartLine_ShoppingCart"),
		ShoppingCartLine_Product("Cart.ShoppingCartLine_Product");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ShoppingCartLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Cart.ShoppingCartLine"));
	}

	protected ShoppingCartLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject shoppingCartLineMendixObject)
	{
		if (shoppingCartLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Cart.ShoppingCartLine", shoppingCartLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Cart.ShoppingCartLine");

		this.shoppingCartLineMendixObject = shoppingCartLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ShoppingCartLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cart.proxies.ShoppingCartLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cart.proxies.ShoppingCartLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cart.proxies.ShoppingCartLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cart.proxies.ShoppingCartLine(context, mendixObject);
	}

	public static cart.proxies.ShoppingCartLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cart.proxies.ShoppingCartLine.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Quanity
	 */
	public final java.lang.Integer getQuanity()
	{
		return getQuanity(getContext());
	}

	/**
	 * @param context
	 * @return value of Quanity
	 */
	public final java.lang.Integer getQuanity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Quanity.toString());
	}

	/**
	 * Set value of Quanity
	 * @param quanity
	 */
	public final void setQuanity(java.lang.Integer quanity)
	{
		setQuanity(getContext(), quanity);
	}

	/**
	 * Set value of Quanity
	 * @param context
	 * @param quanity
	 */
	public final void setQuanity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer quanity)
	{
		getMendixObject().setValue(context, MemberNames.Quanity.toString(), quanity);
	}

	/**
	 * @return value of SellingPrice
	 */
	public final java.math.BigDecimal getSellingPrice()
	{
		return getSellingPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of SellingPrice
	 */
	public final java.math.BigDecimal getSellingPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.SellingPrice.toString());
	}

	/**
	 * Set value of SellingPrice
	 * @param sellingprice
	 */
	public final void setSellingPrice(java.math.BigDecimal sellingprice)
	{
		setSellingPrice(getContext(), sellingprice);
	}

	/**
	 * Set value of SellingPrice
	 * @param context
	 * @param sellingprice
	 */
	public final void setSellingPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal sellingprice)
	{
		getMendixObject().setValue(context, MemberNames.SellingPrice.toString(), sellingprice);
	}

	/**
	 * @return value of LineValue
	 */
	public final java.math.BigDecimal getLineValue()
	{
		return getLineValue(getContext());
	}

	/**
	 * @param context
	 * @return value of LineValue
	 */
	public final java.math.BigDecimal getLineValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.LineValue.toString());
	}

	/**
	 * Set value of LineValue
	 * @param linevalue
	 */
	public final void setLineValue(java.math.BigDecimal linevalue)
	{
		setLineValue(getContext(), linevalue);
	}

	/**
	 * Set value of LineValue
	 * @param context
	 * @param linevalue
	 */
	public final void setLineValue(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal linevalue)
	{
		getMendixObject().setValue(context, MemberNames.LineValue.toString(), linevalue);
	}

	/**
	 * @return value of ShoppingCartLine_ShoppingCart
	 */
	public final cart.proxies.ShoppingCart getShoppingCartLine_ShoppingCart() throws com.mendix.core.CoreException
	{
		return getShoppingCartLine_ShoppingCart(getContext());
	}

	/**
	 * @param context
	 * @return value of ShoppingCartLine_ShoppingCart
	 */
	public final cart.proxies.ShoppingCart getShoppingCartLine_ShoppingCart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cart.proxies.ShoppingCart result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ShoppingCartLine_ShoppingCart.toString());
		if (identifier != null)
			result = cart.proxies.ShoppingCart.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ShoppingCartLine_ShoppingCart
	 * @param shoppingcartline_shoppingcart
	 */
	public final void setShoppingCartLine_ShoppingCart(cart.proxies.ShoppingCart shoppingcartline_shoppingcart)
	{
		setShoppingCartLine_ShoppingCart(getContext(), shoppingcartline_shoppingcart);
	}

	/**
	 * Set value of ShoppingCartLine_ShoppingCart
	 * @param context
	 * @param shoppingcartline_shoppingcart
	 */
	public final void setShoppingCartLine_ShoppingCart(com.mendix.systemwideinterfaces.core.IContext context, cart.proxies.ShoppingCart shoppingcartline_shoppingcart)
	{
		if (shoppingcartline_shoppingcart == null)
			getMendixObject().setValue(context, MemberNames.ShoppingCartLine_ShoppingCart.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ShoppingCartLine_ShoppingCart.toString(), shoppingcartline_shoppingcart.getMendixObject().getId());
	}

	/**
	 * @return value of ShoppingCartLine_Product
	 */
	public final main.proxies.Product getShoppingCartLine_Product() throws com.mendix.core.CoreException
	{
		return getShoppingCartLine_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of ShoppingCartLine_Product
	 */
	public final main.proxies.Product getShoppingCartLine_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ShoppingCartLine_Product.toString());
		if (identifier != null)
			result = main.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ShoppingCartLine_Product
	 * @param shoppingcartline_product
	 */
	public final void setShoppingCartLine_Product(main.proxies.Product shoppingcartline_product)
	{
		setShoppingCartLine_Product(getContext(), shoppingcartline_product);
	}

	/**
	 * Set value of ShoppingCartLine_Product
	 * @param context
	 * @param shoppingcartline_product
	 */
	public final void setShoppingCartLine_Product(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.Product shoppingcartline_product)
	{
		if (shoppingcartline_product == null)
			getMendixObject().setValue(context, MemberNames.ShoppingCartLine_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ShoppingCartLine_Product.toString(), shoppingcartline_product.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return shoppingCartLineMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final cart.proxies.ShoppingCartLine that = (cart.proxies.ShoppingCartLine) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Cart.ShoppingCartLine";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}