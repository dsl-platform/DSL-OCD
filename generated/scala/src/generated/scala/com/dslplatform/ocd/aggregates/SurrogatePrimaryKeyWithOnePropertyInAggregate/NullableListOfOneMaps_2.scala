package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneMaps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneMaps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneMaps_2("+ URI +")"

   def copy(nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = this._nullableListOfOneMaps): NullableListOfOneMaps_2 = {

  require(nullableListOfOneMaps ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
  if(nullableListOfOneMaps.isDefined) require(nullableListOfOneMaps.get ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMaps)
    new NullableListOfOneMaps_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneMaps = nullableListOfOneMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneMaps_2): this.type = {
    this._URI = result._URI
    this._nullableListOfOneMaps = result._nullableListOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneMaps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps")
  def nullableListOfOneMaps = {
    _nullableListOfOneMaps
  }

  def nullableListOfOneMaps_= (value: Option[IndexedSeq[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps") nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneMaps = nullableListOfOneMaps)

}

object NullableListOfOneMaps_2 extends AggregateRootCompanion[NullableListOfOneMaps_2]{

  def apply(
    nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMaps)
    require(nullableListOfOneMaps ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    if (nullableListOfOneMaps.isDefined) require(nullableListOfOneMaps.get ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    new NullableListOfOneMaps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneMaps = nullableListOfOneMaps)
  }

}
