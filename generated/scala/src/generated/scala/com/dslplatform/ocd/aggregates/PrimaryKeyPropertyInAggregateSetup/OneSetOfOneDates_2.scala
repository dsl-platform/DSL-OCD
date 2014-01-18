package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneDates_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneDates: Set[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneDates_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneDates_2("+ URI +")"

   def copy(oneSetOfOneDates: Set[org.joda.time.LocalDate] = this._oneSetOfOneDates): OneSetOfOneDates_2 = {

  require(oneSetOfOneDates ne null, "Null value was provided for property \"oneSetOfOneDates\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDates)
    new OneSetOfOneDates_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneDates = oneSetOfOneDates)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneDates_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneDates = result._oneSetOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneDates_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDates")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneDates = {
    _oneSetOfOneDates
  }

  def oneSetOfOneDates_= (value: Set[org.joda.time.LocalDate]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDates") oneSetOfOneDates: Set[org.joda.time.LocalDate]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneDates = if (oneSetOfOneDates == null) Set.empty else oneSetOfOneDates)

}

object OneSetOfOneDates_2 extends AggregateRootCompanion[OneSetOfOneDates_2]{

  def apply(
    oneSetOfOneDates: Set[org.joda.time.LocalDate] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneDates)
    require(oneSetOfOneDates ne null, "Null value was provided for property \"oneSetOfOneDates\"")
    new OneSetOfOneDates_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneDates = oneSetOfOneDates)
  }

}
