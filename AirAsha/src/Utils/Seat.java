package Utils;

public class Seat {
	private SeatType seatType;
	private int seatNumber;
	private boolean isBooked;
	private Integer bookedBy;

	public Seat(int seatNumber, SeatType seatType) {
		this.seatType = seatType;
		this.seatNumber = seatNumber;
		this.isBooked = false;
		bookedBy = null;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void bookSeat(int userId) {
		isBooked = true;
		bookedBy = userId;
	}

	public void cancelSeatBooking() {
		isBooked = false;
		bookedBy = null;
	}
}