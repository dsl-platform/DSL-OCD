package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableBooleans_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableBooleans_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableBooleans_2("+ URI +")"

   def copy(nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]] = this._nullableListOfNullableBooleans): NullableListOfNullableBooleans_2 = {

  require(nullableListOfNullableBooleans ne null, "Null value was provided for property \"nullableListOfNullableBooleans\"")
  if(nullableListOfNullableBooleans.isDefined) require(nullableListOfNullableBooleans.get ne null, "Null value was provided for property \"nullableListOfNullableBooleans\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableBooleans)
    new NullableListOfNullableBooleans_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableBooleans = nullableListOfNullableBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableBooleans_2): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableBooleans = result._nullableListOfNullableBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableBooleans_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableBooleans")
  def nullableListOfNullableBooleans = {
    _nullableListOfNullableBooleans
  }

  def nullableListOfNullableBooleans_= (value: Option[IndexedSeq[Option[Boolean]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _nullableListOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableBooleans") nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableBooleans = nullableListOfNullableBooleans)

}

object NullableListOfNullableBooleans_2 extends AggregateRootCompanion[NullableListOfNullableBooleans_2]{

  def apply(
    nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableBooleans)
    require(nullableListOfNullableBooleans ne null, "Null value was provided for property \"nullableListOfNullableBooleans\"")
    if (nullableListOfNullableBooleans.isDefined) require(nullableListOfNullableBooleans.get ne null, "Null value was provided for property \"nullableListOfNullableBooleans\"")
    new NullableListOfNullableBooleans_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableBooleans = nullableListOfNullableBooleans)
  }

}
