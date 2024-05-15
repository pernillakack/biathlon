package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "Badges")
public class Badges {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "BadgeInfo")
    private List<BadgeInfo> BadgeInfo;

    @Override
    public String toString() {
        return "Badges{" +
                "BadgeInfo=" + BadgeInfo +
                '}';
    }

    public Badges() {}
    public Badges(List<perni.com.biathlon.models.ibubios.BadgeInfo> badgeInfo) {
        BadgeInfo = badgeInfo;
    }

    public List<perni.com.biathlon.models.ibubios.BadgeInfo> getBadgeInfo() {
        return BadgeInfo;
    }

    public void setBadgeInfo(List<perni.com.biathlon.models.ibubios.BadgeInfo> badgeInfo) {
        BadgeInfo = badgeInfo;
    }
}

