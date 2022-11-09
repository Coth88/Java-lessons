import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    float[] patientsTemperatures = new float[patientsCount];
    float minTemp = 32.0f;
    float maxTemp = 40.0f;
    for (int i = 0; i < patientsTemperatures.length; i++) {
      patientsTemperatures[i] =
          (float) Math.round((Math.random() * (maxTemp - minTemp) + minTemp) * 10) / 10f;
    }
    return patientsTemperatures;
  }

  public static String getReport(float[] temperatureData) {
    int healthyPatientCount = 0;
    float averageTemp = 0;
    float sumTemp = 0;
    String patientTempList = "";

    for (int i = 0; i < temperatureData.length; i++) {
      sumTemp += temperatureData[i];
      if (temperatureData[i] >= 36.2 && temperatureData[i] < 37) {
        healthyPatientCount++;
      }
      patientTempList = patientTempList + " " + temperatureData[i];
    }
    averageTemp = sumTemp / temperatureData.length;
    String format = String.format("%.2f", averageTemp);

    String report =
        "Температуры пациентов:" + patientTempList +
            "\nСредняя температура: " + format +
            "\nКоличество здоровых: " + healthyPatientCount;

    return report;
  }
}
