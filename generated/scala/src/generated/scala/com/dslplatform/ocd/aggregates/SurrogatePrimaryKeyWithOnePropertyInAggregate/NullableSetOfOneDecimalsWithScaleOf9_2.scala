package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneDecimalsWithScaleOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneDecimalsWithScaleOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneDecimalsWithScaleOf9_2("+ URI +")"

   def copy(nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]] = this._nullableSetOfOneDecimalsWithScaleOf9): NullableSetOfOneDecimalsWithScaleOf9_2 = {

  require(nullableSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
  if(nullableSetOfOneDecimalsWithScaleOf9.isDefined) require(nullableSetOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionScale(nullableSetOfOneDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimalsWithScaleOf9)
    new NullableSetOfOneDecimalsWithScaleOf9_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneDecimalsWithScaleOf9 = nullableSetOfOneDecimalsWithScaleOf9)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneDecimalsWithScaleOf9_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneDecimalsWithScaleOf9 = result._nullableSetOfOneDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneDecimalsWithScaleOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimalsWithScaleOf9")
  def nullableSetOfOneDecimalsWithScaleOf9 = {
    _nullableSetOfOneDecimalsWithScaleOf9
  }

  def nullableSetOfOneDecimalsWithScaleOf9_= (value: Option[Set[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimalsWithScaleOf9") nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneDecimalsWithScaleOf9 = nullableSetOfOneDecimalsWithScaleOf9)

}

object NullableSetOfOneDecimalsWithScaleOf9_2 extends AggregateRootCompanion[NullableSetOfOneDecimalsWithScaleOf9_2]{

  def apply(
    nullableSetOfOneDecimalsWithScaleOf9: Option[Set[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionScale(nullableSetOfOneDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimalsWithScaleOf9)
    require(nullableSetOfOneDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
    if (nullableSetOfOneDecimalsWithScaleOf9.isDefined) require(nullableSetOfOneDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableSetOfOneDecimalsWithScaleOf9\"")
    new NullableSetOfOneDecimalsWithScaleOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneDecimalsWithScaleOf9 = nullableSetOfOneDecimalsWithScaleOf9)
  }

}
