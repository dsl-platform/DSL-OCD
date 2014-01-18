package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneDecimalsWithScaleOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneDecimalsWithScaleOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneDecimalsWithScaleOf9_3("+ URI +")"

   def copy(oneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal] = this._oneArrayOfOneDecimalsWithScaleOf9): OneArrayOfOneDecimalsWithScaleOf9_3 = {

  require(oneArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneArrayOfOneDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkArrayScale(oneArrayOfOneDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimalsWithScaleOf9)
    new OneArrayOfOneDecimalsWithScaleOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneDecimalsWithScaleOf9 = oneArrayOfOneDecimalsWithScaleOf9)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneDecimalsWithScaleOf9_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneDecimalsWithScaleOf9 = result._oneArrayOfOneDecimalsWithScaleOf9
    this._ID = result._ID
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneDecimalsWithScaleOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfOneDecimalsWithScaleOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneDecimalsWithScaleOf9 = {
    _oneArrayOfOneDecimalsWithScaleOf9
  }

  def oneArrayOfOneDecimalsWithScaleOf9_= (value: Array[BigDecimal]) {
    com.dslplatform.api.Guards.checkArrayScale(value, 9)
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneDecimalsWithScaleOf9") oneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneDecimalsWithScaleOf9 = if (oneArrayOfOneDecimalsWithScaleOf9 == null) Array.empty else oneArrayOfOneDecimalsWithScaleOf9)

}

object OneArrayOfOneDecimalsWithScaleOf9_3 extends AggregateRootCompanion[OneArrayOfOneDecimalsWithScaleOf9_3]{

  def apply(
    oneArrayOfOneDecimalsWithScaleOf9: Array[BigDecimal] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayScale(oneArrayOfOneDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneDecimalsWithScaleOf9)
    require(oneArrayOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneArrayOfOneDecimalsWithScaleOf9\"")
    new OneArrayOfOneDecimalsWithScaleOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneDecimalsWithScaleOf9 = oneArrayOfOneDecimalsWithScaleOf9)
  }

}
