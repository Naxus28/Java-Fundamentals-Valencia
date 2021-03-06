
public class AlarmClockTest {

	public static void main(String[] args) {
		AlarmClock alarmClockOne = new AlarmClock();
		AlarmClock alarmClockTwo = new AlarmClock();
		String alarmDateTime;
		String alarmDateTimeTwo;
		
		alarmClockOne.turnOn(true);
		alarmClockOne.setAlarmDateTime(2017, 06, 29, 7, 40);
		alarmDateTime = alarmClockOne.getAlarmDateTime();
		System.out.println("Your alarm is set to: " + alarmDateTime);
		alarmClockOne.turnOff(true);
		System.out.println("==============");
		
		alarmClockTwo.turnOff(true);
		alarmClockTwo.turnOff(false);
		alarmClockTwo.turnOn(true);
		alarmClockTwo.turnOff(true);
		alarmClockTwo.setAlarmDateTime(2017, 05, 28, 5, 40);
		alarmClockTwo.turnOn(true);
		alarmClockTwo.setAlarmDateTime(2017, 05, 28, 5, 40);
		alarmDateTimeTwo = alarmClockTwo.getAlarmDateTime();
		System.out.println("Your second alarm is set to: " + alarmDateTimeTwo);
		alarmClockTwo.turnOff(true);
	}

}
