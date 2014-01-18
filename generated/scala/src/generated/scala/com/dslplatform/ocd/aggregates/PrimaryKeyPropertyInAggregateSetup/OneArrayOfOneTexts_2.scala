package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneTexts_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfOneTexts: Array[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneTexts_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneTexts_2("+ URI +")"

   def copy(oneArrayOfOneTexts: Array[String] = this._oneArrayOfOneTexts): OneArrayOfOneTexts_2 = {

  require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)
    new OneArrayOfOneTexts_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfOneTexts = oneArrayOfOneTexts)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneTexts_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneTexts = result._oneArrayOfOneTexts
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneTexts_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneTexts = {
    _oneArrayOfOneTexts
  }

  def oneArrayOfOneTexts_= (value: Array[String]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTexts") oneArrayOfOneTexts: Array[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfOneTexts = if (oneArrayOfOneTexts == null) Array.empty else oneArrayOfOneTexts)

}

object OneArrayOfOneTexts_2 extends AggregateRootCompanion[OneArrayOfOneTexts_2]{

  def apply(
    oneArrayOfOneTexts: Array[String] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTexts)
    require(oneArrayOfOneTexts ne null, "Null value was provided for property \"oneArrayOfOneTexts\"")
    new OneArrayOfOneTexts_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfOneTexts = oneArrayOfOneTexts)
  }

}
