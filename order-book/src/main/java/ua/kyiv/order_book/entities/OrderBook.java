/**
 * 
 */
package entities;

import java.util.List;

/**
 * @author firsov
 *
 */
public class OrderBook {
	
	private int id;
	
	private String timestamp;
	
	private List<BidsAsкs> listBidsAsкs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<BidsAsкs> getListBidsAsкs() {
		return listBidsAsкs;
	}

	public void setListBidsAsкs(List<BidsAsкs> listBidsAsкs) {
		this.listBidsAsкs = listBidsAsкs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((listBidsAsкs == null) ? 0 : listBidsAsкs.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		OrderBook other = (OrderBook) obj;
		if (id != other.id)
			return false;
		if (listBidsAsкs == null) {
			if (other.listBidsAsкs != null)
				return false;
		} else if (!listBidsAsкs.equals(other.listBidsAsкs))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderBook [id=" + id + ", timestamp=" + timestamp + ", listBidsAsкs=" + listBidsAsкs + "]";
	}

}
