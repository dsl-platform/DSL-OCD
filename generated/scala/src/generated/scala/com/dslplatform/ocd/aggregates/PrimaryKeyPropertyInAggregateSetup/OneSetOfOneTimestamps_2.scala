package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneTimestamps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneTimestamps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneTimestamps_2("+ URI +")"

   def copy(oneSetOfOneTimestamps: Set[org.joda.time.DateTime] = this._oneSetOfOneTimestamps): OneSetOfOneTimestamps_2 = {

  require(oneSetOfOneTimestamps ne null, "Null value was provided for property \"oneSetOfOneTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTimestamps)
    new OneSetOfOneTimestamps_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneTimestamps = oneSetOfOneTimestamps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneTimestamps_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneTimestamps = result._oneSetOfOneTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneTimestamps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneTimestamps = {
    _oneSetOfOneTimestamps
  }

  def oneSetOfOneTimestamps_= (value: Set[org.joda.time.DateTime]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTimestamps") oneSetOfOneTimestamps: Set[org.joda.time.DateTime]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneTimestamps = if (oneSetOfOneTimestamps == null) Set.empty else oneSetOfOneTimestamps)

}

object OneSetOfOneTimestamps_2 extends AggregateRootCompanion[OneSetOfOneTimestamps_2]{

  def apply(
    oneSetOfOneTimestamps: Set[org.joda.time.DateTime] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTimestamps)
    require(oneSetOfOneTimestamps ne null, "Null value was provided for property \"oneSetOfOneTimestamps\"")
    new OneSetOfOneTimestamps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneTimestamps = oneSetOfOneTimestamps)
  }

}
