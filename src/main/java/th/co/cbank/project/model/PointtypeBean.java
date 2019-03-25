package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class PointtypeBean {
    private final Logger logger = Logger.getLogger(PointtypeBean.class);
     private String Point_TypeCode;
     private String Point_TypeName;
     private String Point_TypeDateService;
     private Date Point_StartDateService;
     private Date Point_FinishDateService;
     private String Point_StartTimeService1 = "00:00:00";
     private String Point_FinishTimeService1 = "00:00:00";
     private double BahtRatePerPoint1 = 0;
     private double Point1 = 0;
     private String Point_StartTimeService2 = "00:00:00";
     private String Point_FinishTimeService2 = "00:00:00";
     private double BahtRatePerPoint2 = 0;
     private double Point2 = 0;
     private String Point_StartTimeService3 = "00:00:00";
     private String Point_FinishTimeService3 = "00:00:00";
     private double BahtRatePerPoint3 = 0;
     private double Point3 = 0;

    public String getPoint_TypeCode() {
        return Point_TypeCode;
    }

    public void setPoint_TypeCode(String Point_TypeCode) {
        this.Point_TypeCode = Point_TypeCode;
    }

    public String getPoint_TypeName() {
        return Point_TypeName;
    }

    public void setPoint_TypeName(String Point_TypeName) {
        this.Point_TypeName = Point_TypeName;
    }

    public String getPoint_TypeDateService() {
        return Point_TypeDateService;
    }

    public void setPoint_TypeDateService(String Point_TypeDateService) {
        this.Point_TypeDateService = Point_TypeDateService;
    }

    public Date getPoint_StartDateService() {
        return Point_StartDateService;
    }

    public void setPoint_StartDateService(Date Point_StartDateService) {
        this.Point_StartDateService = Point_StartDateService;
    }

    public Date getPoint_FinishDateService() {
        return Point_FinishDateService;
    }

    public void setPoint_FinishDateService(Date Point_FinishDateService) {
        this.Point_FinishDateService = Point_FinishDateService;
    }

    public String getPoint_StartTimeService1() {
        return Point_StartTimeService1;
    }

    public void setPoint_StartTimeService1(String Point_StartTimeService1) {
        this.Point_StartTimeService1 = Point_StartTimeService1;
    }

    public String getPoint_FinishTimeService1() {
        return Point_FinishTimeService1;
    }

    public void setPoint_FinishTimeService1(String Point_FinishTimeService1) {
        this.Point_FinishTimeService1 = Point_FinishTimeService1;
    }

    public double getBahtRatePerPoint1() {
        return BahtRatePerPoint1;
    }

    public void setBahtRatePerPoint1(double BahtRatePerPoint1) {
        this.BahtRatePerPoint1 = BahtRatePerPoint1;
    }

    public double getPoint1() {
        return Point1;
    }

    public void setPoint1(double Point1) {
        this.Point1 = Point1;
    }

    public String getPoint_StartTimeService2() {
        return Point_StartTimeService2;
    }

    public void setPoint_StartTimeService2(String Point_StartTimeService2) {
        this.Point_StartTimeService2 = Point_StartTimeService2;
    }

    public String getPoint_FinishTimeService2() {
        return Point_FinishTimeService2;
    }

    public void setPoint_FinishTimeService2(String Point_FinishTimeService2) {
        this.Point_FinishTimeService2 = Point_FinishTimeService2;
    }

    public double getBahtRatePerPoint2() {
        return BahtRatePerPoint2;
    }

    public void setBahtRatePerPoint2(double BahtRatePerPoint2) {
        this.BahtRatePerPoint2 = BahtRatePerPoint2;
    }

    public double getPoint2() {
        return Point2;
    }

    public void setPoint2(double Point2) {
        this.Point2 = Point2;
    }

    public String getPoint_StartTimeService3() {
        return Point_StartTimeService3;
    }

    public void setPoint_StartTimeService3(String Point_StartTimeService3) {
        this.Point_StartTimeService3 = Point_StartTimeService3;
    }

    public String getPoint_FinishTimeService3() {
        return Point_FinishTimeService3;
    }

    public void setPoint_FinishTimeService3(String Point_FinishTimeService3) {
        this.Point_FinishTimeService3 = Point_FinishTimeService3;
    }

    public double getBahtRatePerPoint3() {
        return BahtRatePerPoint3;
    }

    public void setBahtRatePerPoint3(double BahtRatePerPoint3) {
        this.BahtRatePerPoint3 = BahtRatePerPoint3;
    }

    public double getPoint3() {
        return Point3;
    }

    public void setPoint3(double Point3) {
        this.Point3 = Point3;
    }
}
