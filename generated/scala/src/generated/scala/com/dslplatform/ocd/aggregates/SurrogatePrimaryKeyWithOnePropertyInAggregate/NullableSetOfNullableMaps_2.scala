package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableMaps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableMaps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableMaps_2("+ URI +")"

   def copy(nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]] = this._nullableSetOfNullableMaps): NullableSetOfNullableMaps_2 = {

  require(nullableSetOfNullableMaps ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
  if(nullableSetOfNullableMaps.isDefined) require(nullableSetOfNullableMaps.get ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMaps)
    new NullableSetOfNullableMaps_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableMaps = nullableSetOfNullableMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableMaps_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableMaps = result._nullableSetOfNullableMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableMaps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMaps")
  def nullableSetOfNullableMaps = {
    _nullableSetOfNullableMaps
  }

  def nullableSetOfNullableMaps_= (value: Option[Set[Option[Map[String, String]]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMaps") nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableMaps = nullableSetOfNullableMaps)

}

object NullableSetOfNullableMaps_2 extends AggregateRootCompanion[NullableSetOfNullableMaps_2]{

  def apply(
    nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMaps)
    require(nullableSetOfNullableMaps ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
    if (nullableSetOfNullableMaps.isDefined) require(nullableSetOfNullableMaps.get ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
    new NullableSetOfNullableMaps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableMaps = nullableSetOfNullableMaps)
  }

}
