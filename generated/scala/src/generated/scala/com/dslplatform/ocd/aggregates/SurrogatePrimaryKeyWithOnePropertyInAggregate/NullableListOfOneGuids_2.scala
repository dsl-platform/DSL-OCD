package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneGuids_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneGuids_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneGuids_2("+ URI +")"

   def copy(nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]] = this._nullableListOfOneGuids): NullableListOfOneGuids_2 = {

  require(nullableListOfOneGuids ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
  if(nullableListOfOneGuids.isDefined) require(nullableListOfOneGuids.get ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneGuids)
    new NullableListOfOneGuids_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneGuids = nullableListOfOneGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneGuids_2): this.type = {
    this._URI = result._URI
    this._nullableListOfOneGuids = result._nullableListOfOneGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneGuids_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneGuids")
  def nullableListOfOneGuids = {
    _nullableListOfOneGuids
  }

  def nullableListOfOneGuids_= (value: Option[IndexedSeq[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneGuids") nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneGuids = nullableListOfOneGuids)

}

object NullableListOfOneGuids_2 extends AggregateRootCompanion[NullableListOfOneGuids_2]{

  def apply(
    nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneGuids)
    require(nullableListOfOneGuids ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
    if (nullableListOfOneGuids.isDefined) require(nullableListOfOneGuids.get ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
    new NullableListOfOneGuids_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneGuids = nullableListOfOneGuids)
  }

}
