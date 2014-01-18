package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableDecimalsWithScaleOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableDecimalsWithScaleOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableDecimalsWithScaleOf9_2("+ URI +")"

   def copy(nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]] = this._nullableListOfNullableDecimalsWithScaleOf9): NullableListOfNullableDecimalsWithScaleOf9_2 = {

  require(nullableListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableListOfNullableDecimalsWithScaleOf9\"")
  if(nullableListOfNullableDecimalsWithScaleOf9.isDefined) require(nullableListOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableListOfNullableDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionOptionScale(nullableListOfNullableDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimalsWithScaleOf9)
    new NullableListOfNullableDecimalsWithScaleOf9_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableDecimalsWithScaleOf9_2): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableDecimalsWithScaleOf9 = result._nullableListOfNullableDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableDecimalsWithScaleOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableListOfNullableDecimalsWithScaleOf9")
  def nullableListOfNullableDecimalsWithScaleOf9 = {
    _nullableListOfNullableDecimalsWithScaleOf9
  }

  def nullableListOfNullableDecimalsWithScaleOf9_= (value: Option[IndexedSeq[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDecimalsWithScaleOf9") nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9)

}

object NullableListOfNullableDecimalsWithScaleOf9_2 extends AggregateRootCompanion[NullableListOfNullableDecimalsWithScaleOf9_2]{

  def apply(
    nullableListOfNullableDecimalsWithScaleOf9: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionScale(nullableListOfNullableDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDecimalsWithScaleOf9)
    require(nullableListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"nullableListOfNullableDecimalsWithScaleOf9\"")
    if (nullableListOfNullableDecimalsWithScaleOf9.isDefined) require(nullableListOfNullableDecimalsWithScaleOf9.get ne null, "Null value was provided for property \"nullableListOfNullableDecimalsWithScaleOf9\"")
    new NullableListOfNullableDecimalsWithScaleOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableDecimalsWithScaleOf9 = nullableListOfNullableDecimalsWithScaleOf9)
  }

}
