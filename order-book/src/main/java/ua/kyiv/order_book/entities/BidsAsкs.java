/**
 * 
 */
package entities;

/**
 * @author firsov
 *
 */
public class BidsAsкs {

	private float bids;
	private float asks;
	private int OrderBookId;

	public float getBids() {
		return bids;
	}

	public void setBids(float bids) {
		this.bids = bids;
	}

	public float getAsks() {
		return asks;
	}

	public void setAsks(float asks) {
		this.asks = asks;
	}

	public int getOrderBookId() {
		return OrderBookId;
	}

	public void setOrderBookId(int orderBookId) {
		OrderBookId = orderBookId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + OrderBookId;
		result = prime * result + Float.floatToIntBits(asks);
		result = prime * result + Float.floatToIntBits(bids);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BidsAsкs other = (BidsAsкs) obj;
		if (OrderBookId != other.OrderBookId)
			return false;
		if (Float.floatToIntBits(asks) != Float.floatToIntBits(other.asks))
			return false;
		if (Float.floatToIntBits(bids) != Float.floatToIntBits(other.bids))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BidsAsкs [bids=" + bids + ", asks=" + asks + ", OrderBookId=" + OrderBookId + "]";
	}

}
