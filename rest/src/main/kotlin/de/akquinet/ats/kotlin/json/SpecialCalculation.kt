package de.akquinet.ats.kotlin.json

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class SpecialCalculation {

    @XmlElement val numbers: List<Double> = emptyList()
}
