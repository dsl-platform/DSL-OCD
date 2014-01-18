package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneTimestamps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneTimestamps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneTimestamps_2("+ URI +")"

   def copy(nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = this._nullableListOfOneTimestamps): NullableListOfOneTimestamps_2 = {

  require(nullableListOfOneTimestamps ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
  if(nullableListOfOneTimestamps.isDefined) require(nullableListOfOneTimestamps.get ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTimestamps)
    new NullableListOfOneTimestamps_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneTimestamps = nullableListOfOneTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneTimestamps_2): this.type = {
    this._URI = result._URI
    this._nullableListOfOneTimestamps = result._nullableListOfOneTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneTimestamps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableListOfOneTimestamps")
  def nullableListOfOneTimestamps = {
    _nullableListOfOneTimestamps
  }

  def nullableListOfOneTimestamps_= (value: Option[IndexedSeq[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTimestamps") nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneTimestamps = nullableListOfOneTimestamps)

}

object NullableListOfOneTimestamps_2 extends AggregateRootCompanion[NullableListOfOneTimestamps_2]{

  def apply(
    nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTimestamps)
    require(nullableListOfOneTimestamps ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
    if (nullableListOfOneTimestamps.isDefined) require(nullableListOfOneTimestamps.get ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
    new NullableListOfOneTimestamps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneTimestamps = nullableListOfOneTimestamps)
  }

}
