package exercises;

import java.util.Arrays;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate implements Comparable<JobCandidate> {

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;
	private String[] desiredCandidateAttributes = { "curious", "adaptable", "flexible", "communicative", "improving",
			"open-minded", "data-driven", "creative" };

	public JobCandidate(List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public static void main(String[] args) {
		JobCandidate june = new JobCandidate(Arrays.asList(new String[] { "adaptable", "scatty", "curious" }), 650,
				"Vinny Wade", 1200000);
		JobCandidate alex = new JobCandidate(
				Arrays.asList(new String[] { "creative", "flexible", "adventurous", "cooperative" }), 250,
				"June Clarke", 800000);
		int i = june.compareTo(alex);

		if (i == 0) {
			System.out.println("The both of the candidates got a job!");
		} else if (i == 1)
			System.out.println("June got a job!");
		else
			System.out.println("Alex got a job!");

	}

	@Override
	public int compareTo(JobCandidate jobHunter) {
		int personalityScore;
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < desiredCandidateAttributes.length; i++) {
			for (int j = 0; j < personalityTraits.size(); j++) {
				if (desiredCandidateAttributes[i].contains(personalityTraits.get(j)))
					counter1++;
			}
		}
		for (int i = 0; i < jobHunter.desiredCandidateAttributes.length; i++) {
			for (int j = 0; j < jobHunter.personalityTraits.size(); j++) {
				if (jobHunter.desiredCandidateAttributes[i].contains(jobHunter.personalityTraits.get(j)))
					counter2++;
			}
		}

		if (counter1 == counter2)
			personalityScore = 0;
		else if (counter1 > counter2)
			personalityScore = 1;
		else
			personalityScore = -1;

		int codingHoursScore;
		if (hoursSpentCoding == jobHunter.hoursSpentCoding)
			codingHoursScore = 0;
		else if (hoursSpentCoding > jobHunter.hoursSpentCoding)
			codingHoursScore = 1;
		else
			codingHoursScore = -1;

		int result;
		if ((personalityScore + codingHoursScore) == 0)
			result = 0;
		else if ((personalityScore + codingHoursScore) > 0)
			result = 1;
		else
			result = -1;

		return result;
	}

}
