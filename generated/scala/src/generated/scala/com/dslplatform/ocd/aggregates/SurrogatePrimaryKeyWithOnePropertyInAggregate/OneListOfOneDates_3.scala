package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneDates_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneDates_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneDates_3("+ URI +")"

   def copy(oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate] = this._oneListOfOneDates): OneListOfOneDates_3 = {

  require(oneListOfOneDates ne null, "Null value was provided for property \"oneListOfOneDates\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneDates)
    new OneListOfOneDates_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneDates = oneListOfOneDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneDates_3): this.type = {
    this._URI = result._URI
    this._oneListOfOneDates = result._oneListOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneDates_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneDates")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneDates = {
    _oneListOfOneDates
  }

  def oneListOfOneDates_= (value: IndexedSeq[org.joda.time.LocalDate]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDates") oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneDates = if (oneListOfOneDates == null) IndexedSeq.empty else oneListOfOneDates)

}

object OneListOfOneDates_3 extends AggregateRootCompanion[OneListOfOneDates_3]{

  def apply(
    oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneDates)
    require(oneListOfOneDates ne null, "Null value was provided for property \"oneListOfOneDates\"")
    new OneListOfOneDates_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneDates = oneListOfOneDates)
  }

}
