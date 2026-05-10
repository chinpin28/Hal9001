package Liftoff;

public class Names {
public Names(){}
private String[] NameList={"James","Michael","John","Robert","David","Mary","Patricia","Jennifer","Linda","Elizabeth"};
public String getRanName(){
    return(NameList[((int)(Math.random()*NameList.length))]);
}
}
